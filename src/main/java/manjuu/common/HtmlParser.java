package manjuu.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class HtmlParser {

    // ロガーの宣言
    private Logger log = LogManager.getLogger(HtmlParser.class.getName ());

    // ノード
    private TagNode root;

    public HtmlParser(final TagNode node) {
        root = node;
    }

    /**
     * グラフURL取得処理
     * @param number 台番号
     * @return return グラフURL
     * @throws DataGetterException 例外
     */
    public String getGraph(final String number) throws DataGetterException{
        String URL = null;
        int i = 0;
        try{

            Object[] label_node = root.evaluateXPath("//*[@id='tab-graph-some']/table/tbody/tr/td/p/text()");

            for (;;) {
                if (label_node[i].toString().equals(DGConst.TODAY)){
                    i++;
                    break;
                } else if (label_node.length < i) {
                    log.error("スランプグラフのURL取得に失敗");
                    throw new DataGetterException();
                } else {
                    i++;
                }
            }

            Object[] info_nodes = root.evaluateXPath("//*[@id='tab-graph-some']/table[@class='graph-some']/tbody/tr/td[" + i + "]/img/@src");

            if (info_nodes.length > 0) {
                URL = info_nodes[0].toString();
            } else {
                log.error("スランプグラフのURL取得に失敗");
                throw new DataGetterException();
            }

        }catch(XPatherException  e){
            log.error("HTMLファイルの読み込みに失敗", e);
            throw new DataGetterException(e);
        }
        return URL;
    }

    /**
     * 機種名取得処理
     * @param number 台番号
     * @return name 機種名
     * @throws DataGetterException 例外
     */
    public String getName(final String number) throws DataGetterException{
        String name = null;
        try{

            Object[] info_nodes = root.evaluateXPath("//*[@id='pjax-container']/div[1]/div[1]/ul/li/a/div/div[2]/p[1]/text()");

            if (info_nodes.length > 0) {
                name = info_nodes[0].toString();
            } else {
                log.error("機種名取得に失敗");
                throw new DataGetterException();
            }

        }catch(XPatherException e){
            log.error("HTMLファイルの読み込みに失敗", e);
            throw new DataGetterException(e);
        }
        return name;
    }

    /**
     * ゲーム数取得処理
     * @param number 台番号
     * @return games 総スタート
     * @throws DataGetterException
     */
    public String getGames(final String number) throws DataGetterException{

        String games = null;
        int i = 0;
        try{

            Object[] label_node = root.evaluateXPath("//*[@id='tab-data-some']/table/thead/tr/th/text()");

            for (;;) {
                if (label_node[i].toString().equals(DGConst.GAMES)){
                    i++;
                    break;
                } else if (label_node.length < i) {
                    log.error("HTMLファイルの読み込みに失敗");
                    throw new DataGetterException();
                } else {
                    i++;
                }
            }
            //tbody[1]/tr[日付でずれます]/td[" + i + "]/text()
            Object[] info_nodes = root.evaluateXPath("//tbody[1]/tr[1]/td[" + i + "]/text()");

            if (info_nodes.length > 0) {
                games = info_nodes[0].toString().replace(",","");
            } else {
                log.error("総スタート数取得に失敗");
                throw new DataGetterException();
            }
        }catch(XPatherException e){
            log.error("HTMLファイルの読み込みに失敗", e);
            throw new DataGetterException(e);
        }
        return games;
    }
}
