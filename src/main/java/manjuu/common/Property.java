package manjuu.common;

import java.util.ResourceBundle;

public class Property {

    /**
     * Log4j
     */
    //private Logger log = Logger.getLogger(Property.class.getName ());

    /**
     * 設定ファイル読み込み処理
     * @throws DataGetterException 例外
     */
    public void load() throws DataGetterException{
            ResourceBundle rb = ResourceBundle.getBundle("resource.properties");
            rb.getKeys();
    }
}
