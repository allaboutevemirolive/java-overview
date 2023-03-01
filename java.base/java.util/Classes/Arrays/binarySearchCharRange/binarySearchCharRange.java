package binarySearchCharRange;

import java.util.Arrays;

public class binarySearchCharRange {
    public static void main(String[] args) {
        // create a sorted array of characters
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        
        // search for a key in a specific range of the array using binary search
        char key = 'c';
        int fromIndex = 1;
        int toIndex = 3;
        int index = Arrays.binarySearch(charArray, fromIndex, toIndex, key);
        
        // display the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
    }
}
