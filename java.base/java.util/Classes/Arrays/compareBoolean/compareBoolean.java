package compareBoolean;

import java.util.Arrays;

public class compareBoolean {
    public static void main(String[] args) {
        boolean[] arr1 = { true, false, true };
        boolean[] arr2 = { true, true, false };

        int result = Arrays.compare(arr1, arr2);

        if (result == 0) {
            System.out.println("The arrays are equal");
        } else if (result > 0) {
            System.out.println("The first array is greater");
        } else {
            System.out.println("The second array is greater");
        }
    }
}
