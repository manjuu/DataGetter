package manjuu.common;

public class DGConst {

    private DGConst(){
    }

    /**
     * データゲッター
     */
    public final static String DATAGETTER =  "DataGetter";

    /**
     * ホーム
     */
    public final static String HOME = "/DataGetter/";

    /**
     * リストファイル
     */
    public final static String LIST = "/DataGetter/List/ALL.csv";

    /**
     * DBアドレス
     */
    public final static String DB_URL = "jdbc:mysql://192.168.1.17:3307/DataGetter";

    /**
     * DBユーザ
     */
    public final static String DB_USER = "iku";

    /**
     * DBパスワード
     */
    public final static String DB_PASSWORD = "iku";

    /**
     * スロットデータ格納ディレクトリ
     */
    public final static String REQ_S_DIR = "/DataGetter/SlotMachines/";

    /**
     * パチンコデータ格納ディレクトリ
     */
    public final static String REQ_P_DIR = "/DataGetter/PachinkoMachines/";

    /**
     * ターゲットホールのURL
     */
    public final static String TARGET_URL = "http://papimo.jp/h/00031715/hit/view/";

    /**
     * ソーリー画像
     */
    public final static String SORRY = "";

    /**
     * ターゲットの色
     */
    public final static int TARGETCOLOR = -1301964;

    /**
     * 1ピクセル分のメダル枚数
     */
    public final static double MEDAL_PX = 41.6666666667;

    /**
     * 閉店時の座標x
     */
    public final static int HEITEN_PX = 434;

    /**
     * 0枚基準座標
     */
    public final static int ZERO_PX = 304;

    /**
     * 高さチェック用
     */
    public final static int HEIGHT = 480;

    /**
     * 幅チェック用
     */
    public final static int WIDTH = 480;

    /**
     * スリープタイム
     */
    public final static int SLEEPTIME = 2000;

    /**
     * 取得対象日
     */
    public final static String TODAY = "当日";

    /**
     * 取得対象日
     */
    public final static String TWO_DAYS = "2日前";

    /**
     * 取得カラム名
     */
    public final static String GAMES = "総スタート";

    /**
     * リターンコード：異常終了
     */
    public final static int ABNORMALEND = 9;
}
