package putAll;

import java.util.HashMap;

public class putAll {
    public static void main(String[] args) {
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("apple", 1);
        hashMap1.put("banana", 2);
        hashMap1.put("cherry", 3);
        
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("durian", 4);
        hashMap2.put("elderberry", 5);
        hashMap2.put("fig", 6);
        
        // Add all key-value pairs from hashMap2 to hashMap1 using the putAll() method
        hashMap1.putAll(hashMap2);
        
        // Print out the updated contents of hashMap1
        System.out.println("Updated contents of hashMap1:");
        System.out.println(hashMap1);
    }
}
