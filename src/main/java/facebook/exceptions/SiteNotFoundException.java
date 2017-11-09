package facebook.exceptions;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class SiteNotFoundException extends BaseException {

    @Override
    public void printStackTrace() {
        System.out.println("Site not found");
    }
}
