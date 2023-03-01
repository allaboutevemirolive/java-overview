package peekFirst;

import java.util.Deque;
import java.util.LinkedList;

public class peekFirst {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Get the first element without removing it
        Integer first = deque.peekFirst();
        System.out.println("First element: " + first);
        
        System.out.println("Deque after peek: " + deque);
    }
}
