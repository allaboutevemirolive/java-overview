package merge;

import java.util.HashMap;
import java.util.function.BiFunction;

public class mergeBiFunction {
    public static void main(String[] args) {
        
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add some key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        // Merge a new key-value pair into the map
        String key = "Alice";
        int value = 27;
        BiFunction<Integer, Integer, Integer> remappingFunction = (v1, v2) -> v1 + v2;
        map.merge(key, value, remappingFunction);
        
        // Print the updated map
        System.out.println(map);
    }
}
