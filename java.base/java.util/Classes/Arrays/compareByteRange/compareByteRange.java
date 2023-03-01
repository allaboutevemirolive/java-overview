package compareByteRange;

import java.util.Arrays;

public class compareByteRange {
    public static void main(String[] args) {
        byte[] byteArray1 = {1, 2, 3, 4, 5};
        byte[] byteArray2 = {1, 2, 3, 4, 6, 7};
        byte[] byteArray3 = {2, 3, 4, 5, 6};
        
        int result1 = Arrays.compare(byteArray1, 1, 4, byteArray2, 1, 4);
        int result2 = Arrays.compare(byteArray1, 1, 4, byteArray3, 0, 3);
        
        System.out.println("Result of comparing byteArray1[1-4] and byteArray2[1-4]: " + result1);
        System.out.println("Result of comparing byteArray1[1-4] and byteArray3[0-3]: " + result2);
    }
}
