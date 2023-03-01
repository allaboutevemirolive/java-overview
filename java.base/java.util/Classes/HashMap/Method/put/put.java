package put;

import java.util.HashMap;

public class put {
    public static void main(String[] args) {
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Add some key-value pairs to the map using the put() method
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        
        // Print out the current contents of the map
        System.out.println("Current contents of the map:");
        System.out.println(hashMap);
        
        // Add a new key-value pair to the map using the put() method
        hashMap.put("durian", 4);
        
        // Print out the updated contents of the map
        System.out.println("Updated contents of the map:");
        System.out.println(hashMap);
    }
}
