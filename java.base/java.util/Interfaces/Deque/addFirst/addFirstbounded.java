package addFirst;
import java.util.ArrayDeque;
import java.util.Deque;

public class addFirstbounded {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(2);

        // Add two elements to the deque
        deque.add(1);
        deque.add(2);

        // Attempt to add an element to the front of the deque
        try {
            deque.addFirst(3);
        } catch (IllegalStateException e) {
            System.out.println("Deque is full. Unable to add element.");
        }
    }
}
