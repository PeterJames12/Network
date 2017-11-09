package facebook.exceptions;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class BadCrediteilsException extends BaseException {

    public BadCrediteilsException() {
    }

    public BadCrediteilsException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("bad site");
    }
}
