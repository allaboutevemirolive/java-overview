package offerFirst;

import java.util.Deque;
import java.util.LinkedList;

public class offerFirst {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the deque using offerFirst(E e) method
        deque.offerFirst(3);
        deque.offerFirst(2);
        deque.offerFirst(1);

        // Printing the deque to the console
        System.out.println(deque); // Output: [1, 2, 3]
    }
}
