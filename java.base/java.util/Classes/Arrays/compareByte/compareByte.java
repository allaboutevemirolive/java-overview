package compareByte;

import java.util.Arrays;

public class compareByte {
    public static void main(String[] args) {
        byte[] byteArray1 = {1, 2, 3, 4, 5};
        byte[] byteArray2 = {1, 2, 3, 4, 6};
        byte[] byteArray3 = {1, 2, 3, 4, 5};
        
        int result1 = Arrays.compare(byteArray1, byteArray2);
        int result2 = Arrays.compare(byteArray1, byteArray3);
        
        System.out.println("Result of comparing byteArray1 and byteArray2: " + result1);
        System.out.println("Result of comparing byteArray1 and byteArray3: " + result2);
    }
}
