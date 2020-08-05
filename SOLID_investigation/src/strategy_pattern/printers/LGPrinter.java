package strategy_pattern.printers;

import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.EpubStrategy;
import strategy_pattern.strategy.abstracts.PrintStrategy;

public class LGPrinter extends Printer {

    public LGPrinter() {
        super.printStrategy = new EpubStrategy();
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        super.printStrategy = printStrategy;
    }

}
