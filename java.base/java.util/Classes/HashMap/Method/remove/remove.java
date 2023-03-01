package remove;

import java.util.HashMap;

public class remove {
    public static void main(String[] args) {
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        
        // Print out the current contents of the map
        System.out.println("Current contents of the map:");
        System.out.println(hashMap);
        
        // Remove a key-value pair from the map using the remove() method
        hashMap.remove("banana");
        
        // Print out the updated contents of the map
        System.out.println("Updated contents of the map:");
        System.out.println(hashMap);
    }
}
