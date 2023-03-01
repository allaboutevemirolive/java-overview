package ArrayListInitial;

import java.util.ArrayList;

public class ArrayListInitial {
    public static void main(String[] args) {
        // Creating an ArrayList of strings with initial capacity of 5
        ArrayList<String> names = new ArrayList<String>(5);
        
        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emma");
        
        // Displaying the ArrayList elements
        System.out.println("ArrayList elements: " + names);
    }
}
