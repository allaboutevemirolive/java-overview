package binarySearchBytesRange;

import java.util.Arrays;

// binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
public class binarySearchBytesRange {
    public static void main(String[] args) {
        // Creating a sorted array of bytes
        byte[] numbersArray = {1, 3, 5, 7, 9};
        
        // Searching for a key in a specific range of the array using binary search
        // If key isn't present in array then return (-(insertion point) - 1)
        byte key = 4;
        int fromIndex = 0;
        int toIndex = 4;
        int index = Arrays.binarySearch(numbersArray, fromIndex, toIndex, key);
        
        // Displaying the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
