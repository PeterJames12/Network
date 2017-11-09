package facebook.exceptions;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }
}
