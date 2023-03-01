package binarySearchObject;

import java.util.Arrays;

public class binarySearchObject {
    public static void main(String[] args) {
        // Define an array of Objects
        Object[] arr = { "cherry", "elderberry", "apple", "date", "banana" };

        // Sort the array in natural order
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // Search for a key value
        Object key = "cherry";
        int index = Arrays.binarySearch(arr, key);

        // Print the result
        if (index >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
