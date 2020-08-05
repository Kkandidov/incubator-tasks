package adapter_pattern;

public class Main {
    public static void main(String[] args) {
        String s = "   кот кот дом 6 лошадь мост 6 лошадь дом 1111 кот";

        Systemm systemm = new Systemm(s);
        systemm.getProcessedText(new WordCounterAdapter(new WordCounter(systemm.getEditText())));
    }
}
