package getFirst;

import java.util.Deque;
import java.util.LinkedList;

public class getFirst {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("element 1");
        deque.add("element 2");
        deque.add("element 3");
        deque.add("element 4");

        // get the first element using the getFirst() method
        String firstElement = deque.getFirst();

        // print the first element
        System.out.println("The first element is: " + firstElement);
    }
}
