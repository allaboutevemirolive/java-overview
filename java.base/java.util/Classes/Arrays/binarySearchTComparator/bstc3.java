package binarySearchTComparator;

import java.util.Arrays;
import java.util.Comparator;

// binarySearch(T[] a, T key, Comparator<? super T> c)
public class bstc3 {
    public static void main(String[] args) {
        // Define an array of Strings
        String[] arr = { "apple", "banana", "cherry", "date", "elderberry" };

        // Define a Comparator for case-insensitive sorting
        // method reference
        Comparator<String> comp = String::compareToIgnoreCase;

        // Sort the array using the Comparator
        Arrays.sort(arr, comp);

        // Search for a key value using the Comparator
        String key = "cherry";
        int index = Arrays.binarySearch(arr, key, comp);

        // Print the result
        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
