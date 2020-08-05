package strategy_pattern.strategy;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public class PdfStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("PDF document has been printed");
    }
}
