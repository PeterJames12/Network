package facebook.exceptions;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class NoStartWithProtocolException extends BaseException {

    public NoStartWithProtocolException() {
    }

    public NoStartWithProtocolException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("no protocol!");
    }
}
