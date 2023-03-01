package getLast;

import java.util.*;

public class getLast {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("element 1");
        deque.add("element 2");
        deque.add("element 3");
        deque.add("element 4");

        // get the last element using the getLast() method
        String lastElement = deque.getLast();

        // print the last element
        System.out.println("The last element is: " + lastElement);
    }
}
