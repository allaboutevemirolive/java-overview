package binarySearchShort;

import java.util.Arrays;

public class binarySearchShort {
    public static void main(String[] args) {
        // Define an array of shorts
        short[] arr = { 10, 20, 30, 40, 50 };

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Search for a key value
        short key = 30;
        int index = Arrays.binarySearch(arr, key);

        // Print the result
        if (index >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
