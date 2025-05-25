## Question 1: What is the String API?
**Answer:** The String API is a set of classes and methods that operate on strings, including manipulating characters, comparing strings, searching strings, extracting substrings, and creating copies of strings with alterations.

## Question 2: Explain "String", "StringBuilder", and "StringBuffer".
**Answer:**

- **String:** Immutable sequence of characters.
- **StringBuilder:** Mutable sequence of characters. Not thread-safe.
- **StringBuffer:** Mutable sequence of characters. Thread-safe.

## Question 3: What is an immutable object?
**Answer:** An immutable object is an object whose state cannot be modified after it is created. Strings are a good example of immutable objects.

## Question 4: What are wrapper classes?
**Answer:** Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they "wrap" the primitive data type into an object of that class. Examples include `Integer`, `Character`, `Double`, etc.

## Question 5: Explain autoboxing and unboxing.
**Answer:** Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an `int` to an `Integer`, a `double` to a `Double`, etc. Unboxing is the reverse process, where the object is converted back to a primitive type.

## Question 6: What is the "Collections" API?
**Answer:** The Collections API is a set of classes and interfaces that support operations on collections of objects. These classes and interfaces are grouped under the `java.util` package. The collections framework provides both interfaces that define various collections and classes that implement them.

## Question 7: What are generics?
**Answer:** Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. Much like the more familiar formal parameters used in method declarations, type parameters provide a way for you to reuse the same code with different inputs. The inputs to formal parameters are values, while the inputs to type parameters are types.

## Question 8: What is the "Iterator" interface?
**Answer:** The `Iterator` interface provides methods to iterate over any Collection. It works similarly to a "looping" mechanism, and it allows you to traverse through a collection and remove elements from the collection selectively if desired.

## Question 9: Explain the difference between "Iterator" and "ListIterator".
**Answer:**

- **Iterator:** Enables you to traverse through a collection in the forward direction only, for obtaining or removing elements.
- **ListIterator:** Extends Iterator to allow bidirectional traversal of the list and also to modify elements.

## Question 10: What is a "Map"?
**Answer:** A Map is an object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value. Examples include `HashMap`, `TreeMap`, and `LinkedHashMap`.
