package element;

import java.util.Deque;
import java.util.LinkedList;

public class element {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("element 1");
        deque.add("element 2");
        deque.add("element 3");
        deque.add("element 4");

        // get the first element using the element() method
        // element() method does not remove the element from the deque
        String firstElement = deque.element();

        // print the first element
        System.out.println("The first element is: " + firstElement);
    }
}
