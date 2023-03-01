package binarySearchLongRange;

import java.util.Arrays;

public class binarySearchLongRange {

    public static void main(String[] args) {
        long[] arr = {2L, 3L, 5L, 7L, 11L, 13L};
        int fromIndex = 2;
        int toIndex = 5;
        long key = 7L;
        int index = Arrays.binarySearch(arr, fromIndex, toIndex, key);

        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
