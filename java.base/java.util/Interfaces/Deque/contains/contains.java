package contains;

import java.util.Deque;
import java.util.LinkedList;

public class contains {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque using the addLast(E e) method
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");

        // Check if the deque contains the element "B" using the contains(Object o) method
        boolean containsB = deque.contains("B");

        // Print the result of the contains() method to the console
        System.out.println("Deque contains 'B'? " + containsB);
    }
}
