package asList;

import java.util.Arrays;
import java.util.List;

public class asList {
    public static void main(String[] args) {
        // Creating a List of strings from an array of strings
        String[] namesArray = {"Alice", "Bob", "Charlie", "David", "Emma"};
        List<String> namesList = Arrays.asList(namesArray);
        
        // Displaying the List elements
        System.out.println("List elements: " + namesList);
    }
}
