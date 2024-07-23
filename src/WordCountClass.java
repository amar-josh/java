import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class WordCountClass {
static String statement = "people love to love people";

    public static void main(String[] args) {
        String[] wordsArray = statement.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word: wordsArray){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
