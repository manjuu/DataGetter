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
    protected String COMMAND_NAME = null;

    private final int NORMAL_CODE = 0;

    private final int ERROR_CODE = 9;

    /**
     * ベース処理
     * @param args 引数
     * @return 終了コード
     */
    protected int load (final String[]args) {

        log.info("{} -start- {}", COMMAND_NAME, Arrays.asList(args));

        int exitcode = NORMAL_CODE;

        try {
            // 引数チェック
            checkArgs(args);
            // ビジネスクラスの実行
            execute();
        } catch (Exception e) {
            exitcode = ERROR_CODE;
        }

        log.info("{} -end- exitcode:{}", COMMAND_NAME, exitcode);

        return exitcode;
    }

    protected abstract void checkArgs(final String[]args);

    protected abstract void execute() throws Exception;
}
