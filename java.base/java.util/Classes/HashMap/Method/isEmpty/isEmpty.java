package isEmpty;

import java.util.HashMap;

public class isEmpty {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // add some key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // remove all the key-value pairs
        map.clear();

        // check if the HashMap is empty again
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}
