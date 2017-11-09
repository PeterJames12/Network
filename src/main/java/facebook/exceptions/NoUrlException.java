package facebook.exceptions;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class NoUrlException extends BaseException {

    @Override
    public void printStackTrace() {
        System.out.println("no url!");
    }


}
