package computeIfPresent;

import java.util.HashMap;
import java.util.Map;

// computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

public class computeIfPresent {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Compute the value of an existing key using computeIfPresent()
        Integer twoValue = map.computeIfPresent("two", (k, v) -> v * 10);

        // Display the contents of the map
        System.out.println(map);
        System.out.println("The value of key 'two' is: " + twoValue);
    }
}
