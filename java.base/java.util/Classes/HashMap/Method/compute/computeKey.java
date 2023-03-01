package compute;

import java.util.HashMap;
import java.util.Map;

// compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

// To modify the key in a HashMap, you cannot directly use the compute() method provided by the Map interface. 
// Instead, you need to create a new entry with the new key and the same value, 
// and then remove the old entry from the map
public class computeKey {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Modify the key of an existing entry
        if (map.containsKey("two")) {
            Integer value = map.get("two");
            map.remove("two");
            map.put("newTwo", value);
        }

        // Display the contents of the map
        System.out.println(map);
    }
}
