package tranning.jsons;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class ReaderJsonImpl implements ReaderJson {

    @Override
    public List<String> readJsons() throws IOException {
        String path = "src/main/resources/objective/jsons.txt";
        final List<String> list = Files.readAllLines(Paths.get(path));
        List<String> resultList = new LinkedList<>();
        for (String elem : list) {
            try (final InputStream inputStream = new URL(elem).openStream()) {
                final InputStreamReader reader = new InputStreamReader(inputStream);
                final BufferedReader bufferedReader = new BufferedReader(reader);
                String data;
                while ((data = bufferedReader.readLine()) != null) {
                    resultList.add(data);
                }
            }
        }
        return resultList;
    }
}
