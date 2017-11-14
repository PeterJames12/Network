package tranning.jsons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class WriterImpl implements Writer {

    @Override
    public void write(List<String> jsonList) {
        String path = "src/main/resources/objective/file.txt";
        try {
            Files.write(Paths.get(path), jsonList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
