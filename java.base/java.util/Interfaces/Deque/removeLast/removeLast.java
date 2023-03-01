package removeLast;

import java.util.Deque;
import java.util.LinkedList;

public class removeLast {

    public static void main(String[] args) {

        // Create a deque
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove the last element from the deque
        String removedElement = deque.removeLast();

        // Print the removed element
        System.out.println("Removed element: " + removedElement);

        // Print the deque after removing the last element
        System.out.println("Deque after removing the last element: " + deque);
    }
}
