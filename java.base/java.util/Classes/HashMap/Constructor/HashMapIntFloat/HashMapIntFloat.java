package HashMapIntFloat;

import java.util.HashMap;

public class HashMapIntFloat {
    public static void main(String[] args) {
        // Create a HashMap with an initial capacity of 10 and a load factor of 0.75
        HashMap<String, Integer> map = new HashMap<>(10, 0.75f);

        // Add some key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Print the size of the map
        System.out.println("Size of map: " + map.size());

        // Print the contents of the map
        System.out.println("Contents of map: " + map);
    }
}
