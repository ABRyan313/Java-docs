<h1>Introducing the Collections Framework</h1>

<h2>Key Points</h2>

<h3>Overview</h3>

* The Collections Framework is a widely used API in the JDK for storing and processing data in memory.

* It provides efficient implementations of data structures developed before Java's invention.

* Introduced in Java SE 2 (1998) and significantly updated in:

* Java SE 5 (added generics).

* Java 8 (introduced lambda expressions and default methods in interfaces).

<h3>Structure of the Collections Framework</h3>

* The framework consists of interfaces (defining storage models) and implementations (providing functionality).

* Knowing the right implementation to use depends on:

* How you store data (lists, queues, maps, etc.).

* How you retrieve data (by key, index, or iteration).

* Whether the data structure is concurrent or non-concurrent.

<h3>Understanding Core Interfaces</h3>

* Collections (List, Set, Queue): Stores and iterates over objects.

* Maps (HashMap, TreeMap, ConcurrentHashMap): Stores key-value pairs.

* Iterators: Used to traverse collections efficiently.

* Queue & Stack: Added to the Collection hierarchy but function differently from lists and sets.

<h3>Choosing the Right Collection Type</h3>

Do you need to:

* Store and iterate over objects? → List, Set

* Push/pull objects in a queue? → Queue

* Retrieve objects using keys? → Map

* Access objects by index? → List

* Sort objects? → TreeSet, TreeMap

* Prevent duplicates? → Set

* Handle concurrent access? → ConcurrentHashMap, CopyOnWriteArrayList

* Avoiding Legacy Interfaces & Classes

* Vector & Stack: Replaced by ArrayList and ArrayDeque.

* Enumeration: Replaced by Iterator.

* HashTable: Replaced by HashMap (or ConcurrentHashMap for concurrency).

<h3> Why Use Collections Over Arrays?</h3>

* Collections provide dynamic sizing, automatic tracking of elements, and built-in operations (e.g., merging, sorting).

* Unlike arrays, collections can be extended and customized.

* Collections enforce better object-oriented design compared to raw arrays.
