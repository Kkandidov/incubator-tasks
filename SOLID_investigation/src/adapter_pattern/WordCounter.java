package adapter_pattern;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private String text;
    private String[] array;
    private Map<String, Integer> map;

    public WordCounter(String text) {
        this.text = text;
        this.array = this.text.split(" ");
        this.map = new HashMap<>();
        this.map = getAllWordsInMap();
    }

    public int countWords() {
        return this.array.length;
    }

    public int getCount(String word) {
        word = word.toLowerCase();
        int result = 0;

        if (this.map.containsKey(word)){
            result = map.get(word);
        }

        return result;
    }

    public Map<String, Integer> getAllWords() {
        return this.map;
    }

    private Map<String, Integer> getAllWordsInMap() {
        for (String s : array){
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return this.map;
    }

}
