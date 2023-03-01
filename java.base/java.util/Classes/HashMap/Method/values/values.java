package values;

import java.util.Collection;
import java.util.HashMap;

public class values {
    public static void main(String[] args) {
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        
        // Get the values of the map using the values() method
        Collection<Integer> values = hashMap.values();
        
        // Print out the values of the map
        System.out.println("Values of the map: " + values);
    }
}
