package strategy_pattern.printers;

import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.DocStrategy;
import strategy_pattern.strategy.abstracts.PrintStrategy;

public class LenovoPrinter extends Printer {

    public LenovoPrinter() {
        super.printStrategy = new DocStrategy();
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        super.printStrategy = printStrategy;
    }
}
