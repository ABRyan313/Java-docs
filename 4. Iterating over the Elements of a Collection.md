# Using the for-each Pattern

while just reading the elements of a collection just use for each(enhanced for loop). But when the collection is required to be modified during traversing(reading), we need to use Iterator.

Collection<String> strings = List.of("one", "two", "three");

for (String element: strings) {
    System.out.println(element);
}

output:
one
two
three

# Using Iterator
Iterator can be applied by instantiating the Iterator object. The iterator() method is defined on the Iterable interface, extended by the Collection interface. We can get an Iterator object from any extension of the Collection interface
- Example: Iterator<String> iterator = strings.iterator();

It process the collection using two methods
- hasNext()
- next()

Also has a remove() method. But it will throw an exception while applying on an immutable collection. 
ArrayList, LinkedList and HashSet all support this remove operation

# Updating a Collection While Iterating over It
