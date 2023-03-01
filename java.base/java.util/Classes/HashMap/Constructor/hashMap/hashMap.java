package hashMap;

import java.util.HashMap;

//Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
public class hashMap {
    public static void main(String[] args) {
        // Creating a new HashMap instance
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        myHashMap.put("Alice", 25);
        myHashMap.put("Bob", 30);
        myHashMap.put("Charlie", 35);

        // Displaying the contents of the HashMap
        System.out.println("My HashMap: " + myHashMap);
    }
}
