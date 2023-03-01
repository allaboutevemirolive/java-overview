package removeFirstOccurrence;

import java.util.Deque;
import java.util.LinkedList;

public class removeFirstOccurrence {

    public static void main(String[] args) {

        // Create a deque
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.add("two");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove the first occurrence of "two" from the deque
        deque.removeFirstOccurrence("two");

        // Print the deque after removing the first occurrence of "two"
        System.out.println("Deque after removing the first occurrence of 'two': " + deque);
    }
}
