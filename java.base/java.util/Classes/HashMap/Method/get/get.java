package get;

import java.util.HashMap;
import java.util.Map;

public class get {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Get the value associated with a specific key using get()
        Integer value = map.get("two");

        // Display the value associated with the key
        System.out.println("The value associated with 'two' is: " + value);
    }
}
