package peekLast;

import java.util.Deque;
import java.util.LinkedList;

public class peekLast {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Get the last element without removing it
        Integer last = deque.peekLast();
        System.out.println("Last element: " + last);
        
        System.out.println("Deque after peek: " + deque);
    }
}
