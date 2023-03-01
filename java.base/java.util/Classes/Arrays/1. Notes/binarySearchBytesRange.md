```
In the documentation, the author wrote about binarySearch :

Returns: index of the search key, if it is contained in the array within the specified range; otherwise, (-(insertion point) - 1)

Question :

Why use (-(insertion point) - 1) for unpresent key?
```

The reason `Arrays.binarySearch()` returns the value `-1 - (insertion point)` when the key is not present in the specified range of the array is to : 

- allow for a unique representation of the result.


- Using a negative value to represent an insertion point allows the method to `return a valid index value for both found and not-found cases`. This is because the insertion point can be calculated even when the key is not found in the array.


- By `negating the insertion point` and `subtracting 1` from it, we get a negative value that is `unique and cannot be confused` with an index value for a found key.


For example, let's say we have a sorted array `{1, 3, 5, 7, 9}` and we are searching for the key 4. Since the key is not present in the array, the `Arrays.binarySearch()` method will return the negative value of the insertion point for the key 4, which is 2. To get the unique representation of the result, we negate the insertion point and subtract 1 from it, giving us the value `-3`. This value tells us that the key 4 is not present in the array, and that if we were to insert it into the array, it should be inserted at index 2 (which is the insertion point).

By using this unique representation, 

- we can distinguish between the cases where the key is found and where it is not found, and 

- we can easily calculate the insertion point for an element even when it is not present in the array.
