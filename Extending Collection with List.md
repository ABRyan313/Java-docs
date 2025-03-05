# Exploring the List Interface

The List interface brings two new functionalities to plain collections.
- Order of elements always same
- The elements of a list have an index

# Choosing your Implementation of the List Interface

# Key Points: ArrayList vs LinkedList

- **Collection vs List**:  
  - The `Collection` interface has no direct implementation in the Java Collections Framework.  
  - The `List` interface has two main implementations: `ArrayList` and `LinkedList`.  

- **ArrayList vs LinkedList**:  
  - `ArrayList` is built on an **internal array**.  
  - `LinkedList` is implemented as a **doubly-linked list**.  

- **Performance Considerations**:  
  - **Iteration Speed**: `ArrayList` is faster than `LinkedList` due to **CPU caching** and **pointer chasing** inefficiencies in `LinkedList`.  
  - **Insertion & Deletion**:  
    - Historically, linked lists performed better in these operations.  
    - However, modern **hardware and CPU optimizations** reduce the benefits of `LinkedList`.  

- **When to Use LinkedList?**  
  - If **fast access to the first or last element** is required.  
  - Best for **LIFO (Last In, First Out) stacks** and **FIFO (First In, First Out) queues**.  

- **When to Use ArrayList?**  
  - If **random access by index** is needed.  
  - If **frequent iteration** over elements is required.  
  - **Overall, ArrayList is the better default choice** in most cases.

 # Accessing the Elements Using an Index

 # Key Points: List Interface and Index-Based Methods

- **Enhancements by List Interface**:  
  - The `List` interface extends `Collection` by adding **index-based methods**.  

- **Index-Based Methods**:  
  - `add(index, element)`: Inserts an element at the specified index and shifts remaining elements.  
  - `get(index)`: Retrieves the element at the given index.  
  - `set(index, element)`: Replaces the element at the given index with a new one.  
  - `remove(index)`: Removes the element at the given index and shifts remaining elements.  

- **Exception Handling**:  
  - These methods only work for **valid indexes**.  
  - An **IndexOutOfBoundsException** is thrown if an invalid index is used.  


# Finding the Index of an Object
To return index of elemets use
- indexOf(element)
- lastIndexOf(element)
Returns -1 if not found

# Getting a SubList

- **Functionality of subList(start, end)**:  
  - Returns a **view** of the list containing elements from `start` to `end - 1`.  
  - Throws an **IndexOutOfBoundsException** if the indexes are invalid.  

- **Key Behavior**:  
  - The returned sublist is **not a separate list** but a **view** of the original list.  
  - Modifications to the sublist **affect the main list**, and vice versa.  

- **Example Usage**:  
  ```java
  List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));
  System.out.println(strings);
  strings.subList(2, 5).clear();
  System.out.println(strings);

  [0, 1, 2, 3, 4, 5]
  [0, 1, 5]

# Inserting a Collection
The last pattern of this list is about inserting a collection at a given indexes: addAll(int index, Collection collection).

# Sorting the Elements of a List

- **Lists Maintain Order**:  
  - Unlike plain collections, lists store elements in a **defined order**, making sorting relevant.  

- **Sorting Methods**:  
  - **Before Java 8 (Java 7 and earlier)**:  
    - Sorting was done using `Collections.sort(list, comparator)`.  
  - **Since Java 8**:  
    - Lists have a built-in `sort(comparator)` method.  

- **Comparator Handling**:  
  - The `sort()` method **must** take a comparator as an argument.  
  - If `null` is passed as a comparator:  
    - The method assumes elements implement `Comparable`.  
    - If not, a **ClassCastException** is thrown.  

- **Best Practice**:  
  - Instead of `null`, use `Comparator.naturalOrder()` to sort elements naturally.
 

# Iterating over the Elements of a List

# Key Points: ListIterator in Java

- **What is ListIterator?**  
  - The `ListIterator` provides an additional way to **iterate over a List**.  
  - Obtained using `listIterator()` (can take an optional **starting index**).  
  - Extends `Iterator` and adds extra functionalities.  

- **Additional Methods in ListIterator**:  
  - `hasPrevious()` & `previous()`: Iterate **backward** through the list.  
  - `nextIndex()` & `previousIndex()`: Get the **next** or **previous** element index.  
  - `set(element)`: Update the **last accessed** element via `next()` or `previous()`.  
    - If neither `next()` nor `previous()` has been called, an **IllegalStateException** is thrown.  

- **Example Usage**:  
  ```java
  List<String> numbers = Arrays.asList("one", "two", "three");
  for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext();) {
      String nextElement = iterator.next();
      if (Objects.equals(nextElement, "two")) {
          iterator.set("2");
      }
  }
  System.out.println("numbers = " + numbers);


  numbers = [one, 2, three]

- **Use Cases**:
- Useful for modifying a list during iteration.
- Supports bi-directional traversal.




