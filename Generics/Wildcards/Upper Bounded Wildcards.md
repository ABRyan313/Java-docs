 

1. **Upper Bounded Wildcard (`? extends Type`)** allows flexibility in method parameters by accepting a type and all its subclasses.  
2. **Example Usage**: If you want a method to accept `List<Integer>`, `List<Double>`, and `List<Number>`, you should use `List<? extends Number>`.  
3. **Why?** `List<Number>` is restrictive (only `Number` type allowed), but `List<? extends Number>` works for `Number` and its subclasses (`Integer`, `Double`, `Float`).  
4. **Usage in Methods**:  
   - You can iterate over elements and use methods from the upper-bounded type.  
   - Example: `sumOfList(List<? extends Number>)` method sums up elements of a number list, whether it's `Integer`, `Double`, or `Float`.  
5. **Practical Example**:  
   - `sumOfList(Arrays.asList(1, 2, 3))` → Outputs **6.0**  
   - `sumOfList(Arrays.asList(1.2, 2.3, 3.5))` → Outputs **7.0**  

