package strategy_pattern.strategy;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public class EpubStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("EPUB document has been printed");
    }
}
