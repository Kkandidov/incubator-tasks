package strategy_pattern.strategy;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public class DocStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("DOC document has been printed");
    }
}
