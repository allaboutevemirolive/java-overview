package iterator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class iterator {
    public static void main(String[] args) {
        // create a deque
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("element 1");
        deque.add("element 2");
        deque.add("element 3");
        deque.add("element 4");

        // create an iterator using the iterator() method
        Iterator<String> iterator = deque.iterator();

        // iterate over the deque using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
