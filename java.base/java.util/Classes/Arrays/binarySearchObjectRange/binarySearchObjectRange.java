package binarySearchObjectRange;

import java.util.Arrays;

public class binarySearchObjectRange {
    public static void main(String[] args) {
        // Define an array of Objects
        Object[] arr = { "apple", "banana", "cherry", "date", "elderberry" };

        // Sort a portion of the array in natural order
        int fromIndex = 1;
        int toIndex = 4;
        Arrays.sort(arr, fromIndex, toIndex);

        // Search for a key value in the sorted portion of the array
        Object key = "cherry";
        int index = Arrays.binarySearch(arr, fromIndex, toIndex, key);

        // Print the result
        if (index >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
