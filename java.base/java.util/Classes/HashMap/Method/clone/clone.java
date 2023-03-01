package clone;

import java.util.HashMap;

public class clone {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 3);
        
        // Create a clone of the original map
        HashMap<String, Integer> clonedMap = (HashMap<String, Integer>) originalMap.clone();
        
        // Display the original map and the cloned map
        System.out.println("Original map: " + originalMap);
        System.out.println("Cloned map: " + clonedMap);
        
        // Modify the original map
        originalMap.put("four", 4);
        
        // Display the original map and the cloned map again
        System.out.println("Original map after modification: " + originalMap);
        System.out.println("Cloned map after modification: " + clonedMap);
    }
}
