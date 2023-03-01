package size;

import java.util.HashMap;

public class size {
    public static void main(String[] args) {
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        
        // Get the size of the map using the size() method
        int size = hashMap.size();
        
        // Print out the size of the map
        System.out.println("Size of the map: " + size);
    }
}
