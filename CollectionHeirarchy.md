<h1>Getting to Know the Collection Hierarchy</h1>

<h2>Avoiding Getting Lost in the Collection Hierarchy</h2>

* The Collections Framework consists of multiple hierarchies of interfaces and classes.

* The Collection interface hierarchy is the primary one to understand.

<h3>The Iterable Interface</h3>

* Iterable is the top-level interface, though not part of the Collections Framework.

* Introduced in Java SE 5 to support the enhanced for-each loop.

* Implementing Iterable requires providing an Iterator.

<h3>Storing Elements with the Collection Interface</h3>

* List and Set share a common behavior defined by the Collection interface.

* Key operations of Collection:

 Add or remove elements.

Check for the presence of an element.

Get the size or check if empty.

Clear all elements.

Perform set operations: union, intersection, complement.

Iterate using an Iterator or Stream API.

<h3>Extending Collection with List</h3>

* List maintains the order in which elements are added.

* Provides indexed access:

- Retrieve, insert, replace, or delete elements at a specific index.

- Get a range of elements between two indexes.

* Iterating over a List always follows insertion order.

<h3>Extending Collection with Set</h3>

* Set does not allow duplicate elements.

* Adding an element to a Set may fail if it already exists.

* A Set does not provide indexed access like a List.

<h3>Sorting Elements with SortedSet and NavigableSet</h3>

* SortedSet maintains elements in ascending order.

* Sorting mechanisms:

 Elements must implement Comparable (via compareTo method).

 Provide a Comparator to define a custom sorting order.

* Sorting vs Ordering:

Sorting ensures that elements are always retrieved in ascending order.

Ordering (in a List) preserves insertion order.

* Additional operations in SortedSet:

Get the lowest and highest elements.

Retrieve subsets (headSet, tailSet).

* NavigableSet extends SortedSet by adding:

Reverse iteration over elements.

More fine-grained navigation methods.

