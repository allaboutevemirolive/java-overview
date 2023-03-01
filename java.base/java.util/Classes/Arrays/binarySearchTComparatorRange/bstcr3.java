package binarySearchTComparatorRange;

import java.util.Arrays;
import java.util.Comparator;

public class bstcr3 {
    public static void main(String[] args) {
        Integer[] arr = { 12, 45, 78, 56, 23, 89 };
        int key = 56;

        // method reference
        Comparator<Integer> comp = Integer::compareTo;
        
        int index = Arrays.binarySearch(arr, 1, 6, key, comp);

        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
