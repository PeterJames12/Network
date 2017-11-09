package facebook.service;

import facebook.data.SitesData;
import facebook.exceptions.*;

import java.util.List;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class Service {

    public static void main(String[] args) {
        try {
            review("facebook.com");
        } catch (BaseException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void review(String url) throws BaseException {
        if (url == null) {
            throw new NoUrlException();
        }
        if (!url.startsWith("https://")) {
            throw new NoStartWithProtocolException("hahah");
        }
        final List<String> badSites = SitesData.getBadSites();
        if (badSites.contains(url)) {
            throw new BadCrediteilsException();
        }

        final List<String> goodSites = SitesData.getGoodSites();
        if (!goodSites.contains(url)) {
            throw new SiteNotFoundException();
        }
    }
}
