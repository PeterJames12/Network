package tranning.service.printer;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class AdvancePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("Advance printed " + text);
    }
}
