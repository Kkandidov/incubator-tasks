package strategy_pattern.printers.abstracts;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public abstract class Printer {

    protected PrintStrategy printStrategy;

    public void print() {
        System.out.print(this.getClass().getSimpleName() + ": ");
        printStrategy.print();
    }
}
