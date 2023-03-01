package pop;

import java.util.Deque;
import java.util.LinkedList;

public class pop {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.push(1);
        deque.push(2);
        deque.push(3);
        
        System.out.println("Deque: " + deque);
        
        // Remove and return the top element
        Integer top = deque.pop();
        System.out.println("Removed element: " + top);
        
        System.out.println("Deque after pop: " + deque);
    }
}
