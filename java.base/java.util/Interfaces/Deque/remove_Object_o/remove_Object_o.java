package remove_Object_o;

import java.util.Deque;
import java.util.LinkedList;

public class remove_Object_o {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        
        System.out.println("Deque: " + deque);
        
        // Remove the first occurrence of the specified element
        boolean removed = deque.remove((Integer) 2);
        System.out.println("Removed element: " + removed);
        
        System.out.println("Deque after remove: " + deque);
    }
}
