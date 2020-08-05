package strategy_pattern.strategy;

import strategy_pattern.strategy.abstracts.PrintStrategy;

public class XlsxStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("XLSX document has been printed");
    }
}
