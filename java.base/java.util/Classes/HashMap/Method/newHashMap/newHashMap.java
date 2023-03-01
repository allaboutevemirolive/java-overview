package newHashMap;

import java.util.HashMap;

public class newHashMap {
    public static void main(String[] args) {
        
        // create a new HashMap object with an expected number of mappings of 5
        HashMap<String, Integer> hashMap = HashMap.<String, Integer>newHashMap(5);
        
        // add some mappings to the HashMap
        hashMap.put("John", 35);
        hashMap.put("Sarah", 29);
        hashMap.put("David", 42);
        hashMap.put("Emily", 26);
        
        // print out the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());
    }
}
