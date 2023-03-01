package keySet;

import java.util.HashMap;
import java.util.Set;

public class keySet {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // add some key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // get the set of keys in the HashMap
        Set<String> keys = map.keySet();

        // print out the keys
        System.out.println("The keys in the HashMap are:");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
