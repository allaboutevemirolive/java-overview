package clear;

import java.util.HashMap;

public class clear {
    public static void main(String[] args) {
        // Create a new HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add some key-value pairs to the map
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        
        // Display the contents of the map before clearing it
        System.out.println("Before clear:");
        System.out.println(map);
        
        // Clear the map
        map.clear();
        
        // Display the contents of the map after clearing it
        System.out.println("After clear:");
        System.out.println(map);
    }
}
