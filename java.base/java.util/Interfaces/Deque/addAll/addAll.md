> What does " extends E " mean?

In Java, the "extends" keyword is used in a generic type declaration to specify an upper bound on the type parameter. In the context of the Deque<E> interface, "extends E" means that any type that is used as a type argument for the Deque interface must either be of type E or a subtype of E.

For example, if we have a Deque<String> object, the "extends String" clause means that any method that takes a type parameter of the Deque interface, such as addAll(Collection<? extends E> c), can only accept collections whose elements are of type String or a subtype of String. This prevents type mismatches and ensures type safety when using generic types.

If the "extends E" clause is omitted, the type parameter defaults to Object, which means that any type can be used as a type argument for the Deque interface. However, this can lead to type mismatches and may result in unsafe code. Therefore, it's generally a good practice to specify an upper bound on the type parameter whenever possible.


>So deque only accept element of string?

No, a Deque object can store any type of object, not just String objects. The E in Deque<E> represents a type parameter that can be replaced with any class or interface name, including the name of a user-defined class. This allows us to create Deque objects that store elements of any type.

For example, we can create a Deque object that stores integers by using the Deque<Integer> syntax:

```
Deque<Integer> deque = new LinkedList<>();
deque.add(1);
deque.add(2);
deque.add(3);
```
In this example, we create a Deque object that stores integers using the LinkedList class. We then add three integers to the deque using the add() method. The Deque object stores the integers in the order they were added and provides methods to access and remove the elements from the deque in a first-in, first-out (FIFO) order.

The "extends E" clause in the Deque<E> interface simply ensures that the type parameter used in the Deque object is compatible with the type of elements stored in the deque. In the case of a Deque<String>, it means that the deque can only store String objects or objects that are subclasses of the String class. But for a Deque<Integer>, it means that the deque can only store Integer objects or objects that are subclasses of the Integer class.