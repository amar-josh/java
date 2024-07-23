import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Add values
        map.put("India", 150);
        map.put("China", 140);
        map.put("Pakistan", 70);
        map.put("Nepal", 20);
        map.put("Shrilanka", 50);
        map.put("Bangladesh", 60);
        map.put("Bhutan", 25);

        System.out.println("map = " + map);

        //Get value
        System.out.println(map.get("Bhutan"));
        System.out.println(map.get("Singapore"));
        //if the key not present then print the default value for that key instead of null
        System.out.println(map.getOrDefault("Afghanistan", 45));
        
        //Remove
        map.remove("China");
        System.out.println("map after remove = " + map);

        //Iteration (same like for(int val: arr){})
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.printf("%s: %d%n  ", e.getKey() , e.getValue());
        }

        //Iterate using Key set
        Set<String> keys = map.keySet();
        System.out.println("Values by taking key set");
        for(String key: keys){
            System.out.println(key +" : "+ map.get(key));
        }

    }
}
