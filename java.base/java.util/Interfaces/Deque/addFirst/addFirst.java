package addFirst;
import java.util.Deque;
import java.util.LinkedList;

public class addFirst {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque using the addFirst(E e) method
        deque.addFirst("A");
        deque.addFirst("B");
        deque.addFirst("C");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove the first element from the deque using the removeFirst() method
        String firstElement = deque.removeFirst();

        // Print the removed element and the updated deque
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Updated deque: " + deque);
    }
}
