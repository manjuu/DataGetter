/**
 * DataGetter
 * @author まんじゅう
 * @version 1.0
 */
package manjuu.app;

import manjuu.business.DataGetterBusiness;
import manjuu.common.DGConst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class DataGetter extends Base {

    /*
     * ApplicationContext
     */
    ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml");

    /**
     * コンストラクタ
     */
    DataGetter() {
        super();
        super.COMMAND_NAME = DGConst.DATAGETTER;;
    }

    /**
     * データゲッタメイン処理
     * @param args 引数
     */
    public static void main(final String[]args){
        int exitcode = new DataGetter().load(args);
        //プログラム終了 終了値:exitcode
        System.exit(exitcode);
    }

    /**
     * beanの実行
     * @throws Exception 例外
     */
    protected void execute(final String[]args) throws Exception{
        DataGetterBusiness bean =
                (DataGetterBusiness) context.getBean("DataGetterBusiness");

        bean.execute(args);
    }

    /**
     * 引数チェック
     */
    protected void checkArgs(final String[]args){
    }
}
