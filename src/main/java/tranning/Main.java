package tranning;

import java.io.*;
import java.net.URL;
import java.util.Random;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        final Random random = new Random();
        final int value = 1 + random.nextInt(2);


        String url = "http://www.json-generator.com/api/json/get/ceVnIdXPnm?indent=2";
        try (final InputStream inputStream = new URL(url).openStream()) {
            final InputStreamReader reader = new InputStreamReader(inputStream);
            final BufferedReader bufferedReader = new BufferedReader(reader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        }
    }
}
