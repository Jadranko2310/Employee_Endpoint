package Employee_Endpoint.exception;

public class APIExceptionRequest extends RuntimeException {

    public APIExceptionRequest(String message) {
        super(message);
    }

    public APIExceptionRequest(String message, Throwable cause) {
        super(message, cause);
    }

    public APIExceptionRequest(Throwable cause) {
        super(cause);
    }

    public APIExceptionRequest(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public APIExceptionRequest() {
    }
}
