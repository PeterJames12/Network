package tranning.jsons;

import java.io.IOException;
import java.util.List;

/**
 * @author Igor Hnes on 11/14/17.
 */
public interface ReaderJson {

    List<String> readJsons() throws IOException;
}
