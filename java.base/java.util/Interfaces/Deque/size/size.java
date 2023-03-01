package size;

import java.util.Deque;
import java.util.LinkedList;

public class size {

    public static void main(String[] args) {

        // Create a deque
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.add("one");
        deque.add("two");
        deque.add("three");

        // Get the size of the deque
        int dequeSize = deque.size();

        // Print the size of the deque
        System.out.println("Size of the deque: " + dequeSize);

        // Add more elements to the deque
        deque.add("four");
        deque.add("five");

        // Print the updated size of the deque
        System.out.println("Updated size of the deque: " + deque.size());
    }
}
