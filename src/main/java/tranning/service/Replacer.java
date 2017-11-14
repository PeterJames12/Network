package tranning.service;

import tranning.service.printer.AdvancePrinter;
import tranning.service.printer.ConsolePrinter;
import tranning.service.printer.Printer;
import tranning.service.printer.PrinterImpl;
import tranning.service.reader.Reader;
import tranning.service.reader.ReaderImpl;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class Replacer {

    private final Reader reader;
    private final Printer printer;

    public Replacer(Reader reader, Printer printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Printer printer = new PrinterImpl();
        Printer advancePrinter = new AdvancePrinter();
        Printer consolePrinter = new ConsolePrinter();

        final Replacer replacer = new Replacer(reader, printer);

        final Replacer advanceReplacer = new Replacer(reader, advancePrinter);
        final Replacer consoleReplacer = new Replacer(reader, consolePrinter);

        replacer.replacer();
        advanceReplacer.replacer();
        consoleReplacer.replacer();
    }

    private void replacer() {
        final String text = reader.read();
        final String replacedText = text.replace("(", ")");
        printer.print(replacedText);
    }
}
