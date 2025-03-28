1. **Unbounded Wildcard (`<?>`)** is used when the exact type is unknown or irrelevant.  
   - Example: `List<?>` means "a list of anything" (could be `List<String>`, `List<Integer>`, etc.).  

2. **When to Use?**  
   - If your method only relies on `Object` class methods (like `toString()`, `hashCode()`, etc.).  
   - If the method does not depend on the specific type (e.g., `size()`, `clear()` work the same regardless of type).  

3. **Wrong Approach**  
   - `public static void printList(List<Object> list)` **does NOT work** for `List<Integer>`, `List<String>`, etc., because `List<Integer>` is NOT a subtype of `List<Object>`.  

4. **Correct Approach**  
   - `public static void printList(List<?> list)` → Works for any type (`List<Integer>`, `List<String>`, etc.).  

5. **Example Usage**  
   ```java
   List<Integer> li = Arrays.asList(1, 2, 3);
   List<String> ls = Arrays.asList("one", "two", "three");
   printList(li); // Works
   printList(ls); // Works
   ```

6. **Difference Between `List<Object>` and `List<?>`**  
   - `List<Object>` **allows inserting** any object.  
   - `List<?>` **only allows inserting `null`**, since its exact type is unknown.  

Let me know if you need more clarity! 🚀
