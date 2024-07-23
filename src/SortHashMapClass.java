import java.util.*;

public class SortHashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("India", 150);
        countryPopulation.put("China", 140);
        countryPopulation.put("Pakistan", 70);
        countryPopulation.put("Nepal", 20);
        countryPopulation.put("Sri Lanka", 50);
        countryPopulation.put("Bangladesh", 60);
        countryPopulation.put("Bhutan", 25);

        // old map before sort
        System.out.println("Original HashMap: " + countryPopulation);
        Map<String, Integer> sortedMap = sortByValue(countryPopulation);
        // new map after sort
        System.out.println("Sorted HashMap by value: " + sortedMap);
    }

    public static Map<String, Integer> sortByValue(HashMap<String, Integer> countryPopulation) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(countryPopulation.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
