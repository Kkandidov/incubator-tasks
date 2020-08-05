package strategy_pattern;

import strategy_pattern.printers.*;
import strategy_pattern.printers.abstracts.Printer;
import strategy_pattern.strategy.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LenovoPrinter lenovoPrinter = new LenovoPrinter();
        LGPrinter lgPrinter = new LGPrinter();
        PhilipsPrinter philipsPrinter = new PhilipsPrinter();
        SamsungPrinter samsungPrinter = new SamsungPrinter();
        SonyPrinter sonyPrinter = new SonyPrinter();

        List<Printer> list = Arrays.asList(
                lenovoPrinter, lgPrinter, philipsPrinter, samsungPrinter, sonyPrinter
        );

        show(list);

        System.out.println("----------------------------------------------");

        lenovoPrinter.setPrintStrategy(new EpubStrategy());
        lgPrinter.setPrintStrategy(new DocStrategy());
        philipsPrinter.setPrintStrategy(new PdfStrategy());
        samsungPrinter.setPrintStrategy(new XlsxStrategy());
        sonyPrinter.setPrintStrategy(new PdfStrategy());

        show(list);

    }

    public static void show(List<Printer> list){
        for (Printer p : list){
            p.print();
        }
    }
}
