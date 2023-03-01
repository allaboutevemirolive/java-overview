package binarySearchShortRange;

import java.util.Arrays;

public class binarySearchShortRange {
    public static void main(String[] args) {
        // Define an array of shorts
        short[] arr = { 10, 20, 30, 40, 50 };

        // Sort a portion of the array in ascending order
        int fromIndex = 1;
        int toIndex = 4;
        Arrays.sort(arr, fromIndex, toIndex);

        // Search for a key value in the sorted portion of the array
        short key = 30;
        int index = Arrays.binarySearch(arr, fromIndex, toIndex, key);

        // Print the result
        if (index >= 0) {
            System.out.println("Found key " + key + " at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
