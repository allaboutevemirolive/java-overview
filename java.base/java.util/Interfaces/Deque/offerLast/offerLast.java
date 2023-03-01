package offerLast;

import java.util.Deque;
import java.util.LinkedList;

public class offerLast {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the deque using offerLast(E e) method
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);

        // Printing the deque to the console
        System.out.println(deque); // Output: [1, 2, 3]
    }
}
