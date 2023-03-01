package offer;

import java.util.ArrayDeque;
import java.util.Deque;

// The code should return false but it do otherwise. Need to check again!
public class offerFalse {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(2);

        deque.offer(1);
        deque.offer(2);

        // Adding a third element to the deque will cause it to exceed its capacity
        boolean result = deque.offer(3);

        // The offer(E e) method returns false if the element cannot be added to the deque
        if (!result) {
            System.out.println("Could not add element to deque");
        }
    }
}
