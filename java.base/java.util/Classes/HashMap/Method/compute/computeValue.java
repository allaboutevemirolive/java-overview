package compute;

import java.util.HashMap;
import java.util.Map;

// compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

public class computeValue {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        
        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Compute the value of an existing key
        map.compute("two", (key, value) -> value * 10);
        
        // Compute the value of a non-existing key
        map.compute("four", (key, value) -> value == null ? 4 : value + 4);
        
        // Display the contents of the map
        System.out.println(map);
    }
}
