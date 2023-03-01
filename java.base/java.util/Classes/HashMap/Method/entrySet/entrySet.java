package entrySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Get the set of key-value pairs in the map using entrySet()
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Display the key-value pairs in the entry set using a for-each loop
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
