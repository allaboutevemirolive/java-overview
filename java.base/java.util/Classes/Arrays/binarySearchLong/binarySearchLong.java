package binarySearchLong;

import java.util.Arrays;

public class binarySearchLong {

    public static void main(String[] args) {
        long[] arr = {2L, 3L, 5L, 7L, 11L, 13L};
        long key = 7L;
        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
