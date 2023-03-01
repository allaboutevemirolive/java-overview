package containsKey;

import java.util.HashMap;
import java.util.Map;

public class containsKey {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Check if a key exists in the map using containsKey()
        boolean containsTwo = map.containsKey("two");

        // Display the result of containsKey()
        System.out.println("The map contains the key 'two': " + containsTwo);
    }
}
