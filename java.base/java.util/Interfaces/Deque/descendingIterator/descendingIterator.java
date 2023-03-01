package descendingIterator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class descendingIterator {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("element 1");
        deque.add("element 2");
        deque.add("element 3");
        deque.add("element 4");

        System.out.println("Deque: " + deque);

        System.out.println("Reversed Deque: ");
        // create a descending iterator
        Iterator<String> descendingIterator = deque.descendingIterator();

        // iterate over the deque in reverse order
        while (descendingIterator.hasNext()) {
            String element = descendingIterator.next();
            System.out.println(element);
        }
    }
}
