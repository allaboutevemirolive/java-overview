package removeFirst;

import java.util.Deque;
import java.util.LinkedList;

public class removeFirst {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Remove and return the first element
        Integer first = deque.removeFirst();
        System.out.println("Removed element: " + first);
        
        System.out.println("Deque after remove: " + deque);
    }
}
