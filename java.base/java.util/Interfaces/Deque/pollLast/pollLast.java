package pollLast;

import java.util.Deque;
import java.util.LinkedList;

public class pollLast {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Remove and return the last element
        Integer last = deque.pollLast();
        System.out.println("Removed element: " + last);
        
        System.out.println("Deque after poll: " + deque);
    }
}
