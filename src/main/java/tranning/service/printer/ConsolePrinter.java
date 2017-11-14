package tranning.service.printer;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class ConsolePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text + " " + "length: " + text.length());
    }
}
