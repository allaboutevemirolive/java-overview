package HashMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapping {
    public static void main(String[] args) {
        // Creating a Map object with some key-value pairs
        Map<String, Integer> fruits1 = new HashMap<>();
        fruits1.put("apple", 3);
        fruits1.put("banana", 2);
        fruits1.put("orange", 5);

        Map<String, ArrayList<Integer>> nums1 = new HashMap<>();
        nums1.put("apple", new ArrayList<>(Arrays.asList(1, 2, 3)));
        nums1.put("banana", new ArrayList<>(Arrays.asList(4, 5)));
        nums1.put("orange", new ArrayList<>(Arrays.asList(6)));


        // Using the constructor to create a new HashMap from the first one
        HashMap<String, ArrayList<Integer>> nums2 = new HashMap<>(nums1);
        
        Map<String, Integer> fruits2 = new HashMap<>(fruits1);


        // Printing the contents of both maps
        System.out.println("fruits1: " + fruits1);
        System.out.println("fruits2: " + fruits2);

        System.out.println("nums1: " + nums1);
        System.out.println("nums2: " + nums2);


    }
}
