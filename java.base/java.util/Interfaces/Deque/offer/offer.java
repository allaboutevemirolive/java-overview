package offer;

import java.util.*;

public class offer {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque using offer() method
        deque.offer("element 1");
        deque.offer("element 2");
        deque.offer("element 3");
        deque.offer("element 4");

        // print the deque
        System.out.println("Deque elements: " + deque);
    }
}
