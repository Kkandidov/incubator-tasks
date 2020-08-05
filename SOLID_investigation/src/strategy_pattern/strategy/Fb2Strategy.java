package strategy_pattern.strategy;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public class Fb2Strategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("FB2 document has been printed");
    }
}
