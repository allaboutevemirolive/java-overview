package binarySearchFloatRange;

import java.util.Arrays;

public class binarySearchFloatRange {
    public static void main(String[] args) {
        // create a sorted array of floats
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        
        // search for a key in a specific range of the array using binary search
        float key = 3.3f;
        int fromIndex = 1;
        int toIndex = 3;
        int index = Arrays.binarySearch(floatArray, fromIndex, toIndex, key);
        
        // display the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
