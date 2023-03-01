package add;
import java.util.Deque;
import java.util.LinkedList;

public class add {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque using add(E e) method
        deque.add("apple");
        deque.add("banana");
        deque.add("cherry");

        // Print the deque
        System.out.println("Deque: " + deque);
    }
}
