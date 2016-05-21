package manjuu.app;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Base {

    /**
     * Log4j
     */
    private Logger log = LogManager.getLogger();

    /**
     * コマンド名
     */
    String commandName = null;

    /**
     * ベース処理
     * @param args 引数
     * @return 終了コード
     */
    protected int load (String[]args) {

        log.info("{} -start- {}", commandName, Arrays.asList(args));

        int exitcode = 0;

        try {
            // 引数チェック
            checkArgs(args);
            // ビジネスクラスの実行
            execute();
        } catch (Exception e) {
            exitcode = 9;
        }

        log.info("{} -end- exitcode:{}", commandName, exitcode);

        return exitcode;
    }

    protected abstract void checkArgs(String[]args);

    protected abstract void execute() throws Exception;
}
