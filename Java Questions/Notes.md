### 11) Can a class extend itself?

No, a class cannot extend itself.

---

### 12) Do constructors and initializers also get inherited to subclasses?

No, constructors and initializers (static initializers and instance initializers) are **not inherited** to subclasses.
However, they **are executed** when instantiating a subclass.

---

### 13) What happens if both the superclass and subclass have a field with the same name?

The superclass field will be **hidden** in the subclass.
You can access the hidden superclass field in the subclass using the `super` keyword.

---

### 14) Do static members also get inherited to subclasses?

Yes, **static members** of a class are also **inherited** by subclasses.

---

### 15) What is the difference between `super()` and `this()`?

* `super()` — Calls the **superclass constructor**
* `this()` — Calls **another constructor** of the same class

---

### 16) What are the differences between static initializers and instance initializers?

| Static Initializers                            | Instance Initializers                                    |
| ---------------------------------------------- | -------------------------------------------------------- |
| Executed when a class is loaded into memory.   | Executed each time a new object of the class is created. |
| Used to initialize static/class-level members. | Used to initialize non-static/instance members.          |

---

### 17) How do you instantiate a class using Java 8 method references?

```java
ClassName::new
```

---

### 18) Can you create an object without using the `new` operator in Java?

Yes, we can create an object without using `new`. Here are some ways:

#### a) Using `newInstance()` method

```java
Class c = Class.forName("packageName.MyClass");
MyClass object = (MyClass) c.newInstance();
```

#### b) Using `clone()` method

```java
MyClass object1 = new MyClass();
MyClass object2 = object1.clone();
```

#### c) Using deserialization

```java
ObjectInputStream inStream = new ObjectInputStream(anInputStream);
MyClass object = (MyClass) inStream.readObject();
```

#### d) String and array objects

```java
String s = "string object";
int[] a = {1, 2, 3, 4};
```

---

### 19) What is constructor chaining?

**Constructor Chaining** is the process of calling one constructor from another:

* Use `this()` to call another constructor in the same class.
* Use `super()` to call the superclass constructor.

---

### 20) Can we call a subclass constructor from a superclass constructor?

**No**, Java does not allow calling a subclass constructor from a superclass constructor.

---

✅ You can now copy this directly into a `.md` file without any wrapping or escaping issues. Let me know if you’d like a downloadable version!
