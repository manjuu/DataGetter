package manjuu.common;

public class DataGetterException extends Exception{

    public DataGetterException() {
        this("DataGetterException!!!");
    }

    public DataGetterException(String message) {
        super(message);
    }

    public DataGetterException(Exception e) {
        super(e);
    }

    public DataGetterException(String message, Exception e) {
        super(e);
    }
}
