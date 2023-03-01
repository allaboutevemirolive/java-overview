package removeLastOccurrence;

import java.util.Deque;
import java.util.LinkedList;

public class removeLastOccurrence {

    public static void main(String[] args) {

        // Create a deque
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("two");
        deque.add("four");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove the last occurrence of "two" from the deque
        deque.removeLastOccurrence("two");

        // Print the deque after removing the last occurrence of "two"
        System.out.println("Deque after removing the last occurrence of 'two': " + deque);
    }
}
