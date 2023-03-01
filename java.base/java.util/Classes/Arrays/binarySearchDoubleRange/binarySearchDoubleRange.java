package binarySearchDoubleRange;

import java.util.Arrays;

public class binarySearchDoubleRange {
    public static void main(String[] args) {
        // create a sorted array of doubles
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        
        // search for a key in a specific range of the array using binary search
        double key = 3.3;
        int fromIndex = 1;
        int toIndex = 3;
        int index = Arrays.binarySearch(doubleArray, fromIndex, toIndex, key);
        
        // display the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
