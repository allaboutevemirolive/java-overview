package binarySearchChar;

import java.util.Arrays;

public class binarySearchChar {
    public static void main(String[] args) {
        // create a sorted array of characters
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        
        // search for a key in the array using binary search
        char key = 'c';
        int index = Arrays.binarySearch(charArray, key);
        
        // display the index of the key in the array
        System.out.println("Index of " + key + " in the array: " + index);
        
        // search for a key that is not present in the array
        char nonExistentKey = 'b';
        int nonExistentIndex = Arrays.binarySearch(charArray, nonExistentKey);
        
        // display the index of the non-existent key in the array
        System.out.println("Index of " + nonExistentKey + " in the array: " + nonExistentIndex);
    }
}
