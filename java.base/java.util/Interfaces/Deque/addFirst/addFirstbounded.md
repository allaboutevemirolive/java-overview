In this example, we create a bounded Deque object of type Integer using the ArrayDeque class with a capacity of 2 elements. We then add two elements to the deque using the add() method. This fills the deque to its capacity.

Next, we attempt to add an element to the front of the deque using the addFirst(E e) method. Since the deque is already full, this operation throws an IllegalStateException. We catch this exception and print a message to the console indicating that the deque is full and unable to add the element.

Note that the ArrayDeque class is an implementation of the Deque interface that allows for bounded and unbounded deques. In a bounded deque, adding an element to the front or back of the deque when it's already full will result in an exception being thrown.