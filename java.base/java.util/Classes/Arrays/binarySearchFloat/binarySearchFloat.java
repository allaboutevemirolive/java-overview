package binarySearchFloat;

import java.util.Arrays;

public class binarySearchFloat {
    public static void main(String[] args) {
        // create a sorted array of floats
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        
        // search for a key in the array using binary search
        float key = 4.4f;
        int index = Arrays.binarySearch(floatArray, key);
        
        // display the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
