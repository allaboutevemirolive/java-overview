package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollection {
    public static void main(String[] args) {
        // Creating an ArrayList of integers from an existing array
        Integer[] numbersArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbersArray));
        
        // Displaying the ArrayList elements
        System.out.println("ArrayList elements: " + numbersList);
    }
}
