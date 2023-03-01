package computeIfAbsent;

import java.util.HashMap;
import java.util.Map;

// computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)

public class computeIfAbsent {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Compute the value of a non-existing key using computeIfAbsent()
        Integer fourValue = map.computeIfAbsent("four", k -> 4);

        // Display the contents of the map
        System.out.println(map);
        System.out.println("The value of key 'four' is: " + fourValue);
    }
}
