package push;

import java.util.Deque;
import java.util.LinkedList;

public class push {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.push(1);
        deque.push(2);
        deque.push(3);
        
        System.out.println("Deque: " + deque);
    }
}
