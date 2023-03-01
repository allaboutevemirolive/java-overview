package binarySearchIntRange;

import java.util.Arrays;

public class binarySearchIntRange {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13};
        int key = 7;
        int index = Arrays.binarySearch(arr, 0, arr.length, key);

        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
