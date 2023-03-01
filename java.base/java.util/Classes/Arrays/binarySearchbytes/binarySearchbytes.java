package binarySearchbytes;

import java.util.Arrays;

public class binarySearchbytes {
    public static void main(String[] args) {
        // Creating a sorted array of bytes
        byte[] numbersArray = {1, 3, 5, 7, 9};
        
        // Searching for a key in the array using binary search
        byte key = 5;
        int index = Arrays.binarySearch(numbersArray, key);
        
        // Displaying the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
