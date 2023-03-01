package containsValue;

import java.util.HashMap;
import java.util.Map;

public class containsValue {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Check if a value exists in the map using containsValue()
        boolean containsThree = map.containsValue(3);

        // Display the result of containsValue()
        System.out.println("The map contains the value '3': " + containsThree);
    }
}
