package adapter_pattern;

import java.util.Comparator;
import java.util.Map;

public class WordCounterAdapter implements TextProcessor {

    private WordCounter wordCounter;

    public WordCounterAdapter(WordCounter wordCounter) {
        this.wordCounter = wordCounter;
    }


    @Override
    public void processTest(String text) {
        Map<String, Integer> map = wordCounter.getAllWords();

        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey()));

    }
}
