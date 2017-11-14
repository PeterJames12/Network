package tranning.jsons;

import tranning.service.reader.Reader;
import tranning.service.reader.ReaderImpl;

import java.io.IOException;
import java.util.List;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class Service {

    public static void main(String[] args) throws IOException {
        ReaderJson reader = new ReaderJsonImpl();
        Writer writer = new WriterImpl();
        final List<String> list = reader.readJsons();
        writer.write(list);
    }
}
