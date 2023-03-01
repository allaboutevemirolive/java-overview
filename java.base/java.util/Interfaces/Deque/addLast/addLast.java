package addLast;

import java.util.Deque;
import java.util.LinkedList;

public class addLast {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque using the addLast(E e) method
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove the last element from the deque using the removeLast() method
        String lastElement = deque.removeLast();

        // Print the removed element and the updated deque
        System.out.println("Removed last element: " + lastElement);
        System.out.println("Updated deque: " + deque);
    }
}
