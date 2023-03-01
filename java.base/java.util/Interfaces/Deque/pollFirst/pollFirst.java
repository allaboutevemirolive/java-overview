package pollFirst;

import java.util.Deque;
import java.util.LinkedList;

public class pollFirst {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Remove and return the first element
        Integer first = deque.pollFirst();
        System.out.println("Removed element: " + first);
        
        System.out.println("Deque after poll: " + deque);
    }
}
