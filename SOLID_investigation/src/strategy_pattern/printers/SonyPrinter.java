package strategy_pattern.printers;

import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.XlsxStrategy;
import strategy_pattern.strategy.abstracts.PrintStrategy;

public class SonyPrinter extends Printer {

    public SonyPrinter() {
        super.printStrategy = new XlsxStrategy();
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        super.printStrategy = printStrategy;
    }
}
