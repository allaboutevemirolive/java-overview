package binarySearchTComparator;

import java.util.Arrays;
import java.util.Comparator;

// binarySearch(T[] a, T key, Comparator<? super T> c)
public class bstc1 {
    public static void main(String[] args) {
        // Define an array of Strings
        String[] arr = { "apple", "banana", "cherry", "date", "elderberry" };

        // Define a Comparator for case-insensitive sorting
        // anonymous inner class
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };

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
