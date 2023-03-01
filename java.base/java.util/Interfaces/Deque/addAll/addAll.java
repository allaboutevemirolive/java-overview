package addAll;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class addAll {

    public static void main(String[] args) {
        Deque<String> dequeString = new LinkedList<>();
        Deque<Integer> dequeNumber = new LinkedList<>();

        // Create a collection of elements
        String[] fruits = { "apple", "banana", "cherry" };
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Add all elements from the collection to the deque using addAll(Collection<? extends E> c) method
        // We use the Arrays.asList() method to convert the array to a List
        dequeString.addAll(Arrays.asList(fruits));
        dequeNumber.addAll(Arrays.asList(numbers));

        // Print the deque
        System.out.println("Deque: " + dequeString);
        System.out.println("Deque: " + dequeNumber);
    }
}
