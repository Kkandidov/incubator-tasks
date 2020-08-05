package strategy_pattern.printers;

import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.Fb2Strategy;
import strategy_pattern.strategy.abstracts.PrintStrategy;

public class PhilipsPrinter extends Printer {

    public PhilipsPrinter() {
        super.printStrategy = new Fb2Strategy();
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        super.printStrategy = printStrategy;
    }
}
