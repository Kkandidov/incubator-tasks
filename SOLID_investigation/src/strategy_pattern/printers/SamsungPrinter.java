package strategy_pattern.printers;

import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.PdfStrategy;
import strategy_pattern.strategy.abstracts.PrintStrategy;

public class SamsungPrinter extends Printer {

    public SamsungPrinter() {
        super.printStrategy = new PdfStrategy();
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        super.printStrategy = printStrategy;
    }
}
