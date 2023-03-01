package compareBooleanRange;

import java.util.Arrays;

public class compareBooleanRange {
    public static void main(String[] args) {
        boolean[] arr1 = { true, false, true };
        boolean[] arr2 = { true, true, false, false, true };
        int result = Arrays.compare(arr1, 0, arr1.length, arr2, 1, 4);

        if (result == 0) {
            System.out.println("The subarrays are equal");
        } else if (result > 0) {
            System.out.println("The first subarray is greater");
        } else {
            System.out.println("The second subarray is greater");
        }
    }
}
