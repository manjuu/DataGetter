package manjuu.business;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

import manjuu.common.DGConst;
import manjuu.common.Dao;
import manjuu.common.DataGetterException;
import manjuu.common.HtmlParser;
import manjuu.common.MachineData;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.springframework.beans.factory.annotation.Autowired;

public class DataGetterBusiness {

    /**
     * Log4j
     */
    private Logger log = LogManager.getLogger(DataGetterBusiness.class.getName ());

    /**
     * Dao
     */
    @Autowired
    Dao dao;

    /**
     * メイン処理実行
     * @throws Exception
     */
    public void execute() throws Exception{
        //変数初期化
        int totalGames = 0;
        int totalSamai = 0;
        MachineData md = null;
        String graphUrl = null;
        HtmlParser htmlparse = null;
        StringBuilder buf = new StringBuilder();

        //インスタンス化
        ArrayList<String> machineList = new ArrayList<String>();
        md = new MachineData();

        try{
            //必須ディレクトリ作成処理呼び出し処理
            createDir(DGConst.REQ_S_DIR);
            createDir(DGConst.REQ_P_DIR);

            //日付取得(フォーマット:yyyy-mm-dd)
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(cal.getTime());

            //日付のセット
            md.setDate(strDate);

            //リストファイル取得
            log.info("指定した機種リストを読み込みます");
            getMachineList(machineList);

            //台数分ループ処理
            for (String number : machineList) {
                //台データ格納ディレクトリ作成処理
                createDir(DGConst.REQ_S_DIR + number);
                //ゴミファイル削除処理
                deleteFile(DGConst.REQ_S_DIR + number + "/tmp.html");
                deleteFile(DGConst.REQ_S_DIR + number + "/tmp.png");
                //台データのHTMLページダウンロード処理
                download(DGConst.TARGET_URL + number, DGConst.REQ_S_DIR + number + "/" + "tmp.html");
                // cleanerの生成
                HtmlCleaner cleaner = new HtmlCleaner();
                //CleanerProperties props = cleaner.getProperties();

                //HTML page root node
                TagNode node = cleaner.clean(new File("/DataGetter/SlotMachines/" + number + "/tmp.html"), "UTF-8");
                htmlparse = new HtmlParser(node);
                graphUrl = htmlparse.getGraph(number);
                //グラフ画像ダウンロード処理
                download(graphUrl, DGConst.REQ_S_DIR + number + "/" + "tmp.png");
                //台番号
                md.setMachineNo(number);
                //機種名取得
                md.setMachineName(htmlparse.getName(number));
                //差枚取得処理
                md.setSamai(readGraph(DGConst.REQ_S_DIR + number + "/tmp.png"));
                //ゲーム数取得処理
                md.setGames(Integer.parseInt(htmlparse.getGames(number)));
                buf.append("台番号:");
                buf.append(md.getMachineNo());
                buf.append(" 機種名:");
                buf.append(md.getMachineName());
                buf.append(" ゲーム数:");
                buf.append(md.getGames());
                buf.append(" 差枚:");
                buf.append(md.getSamai());
                log.info(buf.toString());
                dao.insert(md.getDate(), md.getMachineNo(), md.getMachineName(), md.getGames(), md.getSamai());
                //トータル差枚数計算
                totalGames = totalGames + md.getGames();
                totalSamai = totalSamai + md.getSamai();
                //指定秒待機
                Thread.sleep(DGConst.SLEEPTIME);
            }
            log.info("トータル差枚:" + totalSamai + "  トータルゲーム数:" + totalGames);

        }catch(DataGetterException e){
            throw e;
        }catch(Exception e){
            log.error("予期せぬエラーが発生しました",e);
            throw e;
        }
    }

    /**
     * ディレクトリ作成処理
     * @param dirPath ディレクトリパス
     * @throws DataGetterException 例外
     */
    private void createDir(final String dirPath) throws DataGetterException{

        try {

            File dir = new File(dirPath);
            if(!dir.exists()){
                FileUtils.forceMkdir(dir);
            }

        } catch (IOException e) {
            log.error("ファイル作成処理失敗");
            throw new DataGetterException();
        }
    }

    /**
     * ファイル削除処理
     * @param dirPath ディレクトリパス
     * @throws DataGetterException 例外
     */
    private void deleteFile(final String dirPath) throws DataGetterException{
        File gomi = new File(dirPath);
        try {
            if(gomi.exists()){
                FileUtils.forceDelete(gomi);
            }
        } catch (IOException e) {
            log.error("ファイル削除処理失敗");
            throw new DataGetterException();
        }
    }

    /**
     * ファイルダウンロード処理
     * @param htmlURL ダウンロードURL
     * @param saveFilePath 保存先
     * @throws DataGetterException 例外
     */
    private void download(final String htmlURL, final String saveFilePath) throws DataGetterException{

        InputStream in = null;
        FileOutputStream out = null;

        //保存先指定
        File saveFile = new File(saveFilePath);
        try {
            //ダウンロードするURLを指定
            URL url = new URL(htmlURL);
            URLConnection con = url.openConnection();

            //ストリーム
            in = con.getInputStream();
            out = new FileOutputStream(saveFile, false);

            //データ書き込み
            byte[] b = new byte[4096];
            int readByte = 0;

            while(-1 != (readByte = in.read(b))){
                out.write(b, 0, readByte);
            }

        } catch (Exception e) {
            log.error("ファイルのダウンロードに失敗しました");
            throw new DataGetterException(e);
        }finally{
            try{
                //クローズ処理
                if(out != null){
                    out.close();
                }
                if(in != null){
                    in.close();
                }
            }catch(IOException e){
                log.error("ストリームのクローズに失敗しました");
                throw new DataGetterException(e);
            }
        }
    }

    /**
     * 指定機種のリストファイルを取得する処理
     * @param machineList 台リスト
     * @throws DataGetterException 例外
     */
    private void getMachineList(final ArrayList<String> machineList) throws DataGetterException{

        BufferedReader br = null;

        try {
            //String listFile = fo.getPath();
            String listFile = DGConst.LIST;

            if(listFile == null){
                log.error("リストファイル取得に失敗しました");
                throw new DataGetterException();
            }


            log.info(listFile);

            br = new BufferedReader(new FileReader(listFile));

            //最終行まで読み込む
            String line = "";
            while ((line = br.readLine()) != null) {

                //1行をデータの要素に分割
                StringTokenizer st = new StringTokenizer(line, ",");

                while (st.hasMoreTokens()) {
                    //1行の各要素をタブ区切りで格納
                    //0埋めを行う
                    machineList.add(trimLeftZero(st.nextToken()));
                }
            }
        } catch (FileNotFoundException e) {
            log.error("リストファイルの読み込みに失敗しました");
            throw new DataGetterException();
        } catch (IOException e) {
            log.error("リストファイルの読み込みに失敗しました");
            throw new DataGetterException();
        } finally {
            try{
                //クローズ処理
                if(br != null) {
                    br.close();
                }
            } catch (Exception e) {
                log.error("クローズ処理失敗");
            }
        }
    }

    /**
     * 先頭の0を削除する処理
     * @param str 処理文字列
     * @return トリミング文字列
     */
    private String trimLeftZero(final String str) {
        return str.replaceFirst("^0+", "");
    }

    /**
     * グラフ画像を読み取り座標を取得
     * @param graphPicPath スランプグラフファイルパス
     * @throws DataGetterException 例外
     */
    private int readGraph(String graphPicPath) throws DataGetterException{

        BufferedImage readGraph = null;
        int height = 0;
        int width = 0;
        try{
            //画像ファイル読み込み
            File graphPic = new File(graphPicPath);
            readGraph = ImageIO.read(graphPic);
            //画像の大きさ取得
            height = readGraph.getHeight();
            width = readGraph.getWidth();
            //画像サイズが正しいかチェック
            if(DGConst.HEIGHT != height || DGConst.WIDTH != width){
                throw new IOException("ファイルの形式が不正です");
            }

            for(int x = DGConst.HEITEN_PX;x > 0 ;x--){
                for(int y = 0;y < height;y++){
                    //指定した座標の色を取得
                    if(DGConst.TARGETCOLOR == readGraph.getRGB(x,y)){
                        y = getSamai(y + 3);
                        return y;
                    }
                }
            }

            return 0;

        }catch(IOException e){
            //読み込みもしくはデコードエラー
            log.error("スランプグラフデータ読み込み失敗", e);
            throw new DataGetterException();
        }
    }

    /**
     * 取得した座標から差枚を計算
     * @param y 取得座標
     * @return saimai 差枚
     */
    private int getSamai(int y){
        int samai;
        double pixel;

        pixel = y - DGConst.ZERO_PX;
        samai = (int)(pixel * DGConst.MEDAL_PX);
        samai = -samai;
        return samai;
    }
}
