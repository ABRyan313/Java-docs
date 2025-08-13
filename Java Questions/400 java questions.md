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

### 21) Do constructors have return type? If no, what happens if you keep return type for a constructor?

**No**, constructors in Java don’t have return type. If you keep return type for a constructor, it will be treated as a normal method and also compiler gives a warning saying that method has a constructor name.

---

### 22) What is no-arg constructor?

Constructor without arguments is called no-arg constructor. Default constructor in Java is always a no-arg constructor.

---

### 23) What is the use of private constructors?

Private constructors are used to restrict the instantiation of a class. When a class needs to prevent other classes from creating it’s objects then private constructors are suitable for that. Objects to the class which has only private constructors can be created within the class. A very good use of private constructor is in singleton pattern. This ensures only one instance of a class exist at any point of time.

---

### 24) Can we use this() and super() in a method?

No, we can’t use this() and super() in a method.

---

### 25) What is the difference between class variables and instance variables?

| Class Variables | Instance Variables |
|----------------|--------------------|
| Class variables are declared with keyword `static`. | Instance variables are declared without `static` keyword. |
| Class variables are common to all instances of a class. These variables are shared between the objects of a class. | Instance variables are not shared between the objects of a class. Each instance will have their own copy of instance variables. |
| As class variables are common to all objects of a class, changes made to these variables through one object will reflect in another. | As each object will have its own copy of instance variables, changes made to these variables through one object will not reflect in another object. |
| Class variables can be accessed using either class name or object reference. | Instance variables can be accessed only through object reference. |

---

### 26) What is the constructor overloading? What is the use of constructor overloading?

A class can have any number of constructors. These constructors will have different list of arguments. It is called constructor overloading. Constructor overloading provides different ways to instantiate a class.

---

### 27) What is the difference between constructor and method?

Constructor is a special member of a class which is used to create the objects to the class. It is special because it will have same name as class. It will have no return type.

Method is ordinary member of a class which is used to implement some behavior of a class. It will have it’s own name and return type.

---

### 28) What are the differences between static and non-static methods?

Static method is common to all instances of a class. Static methods are stored in the class memory. Where as non-static methods are stored in the object memory. Each instance of a class will have their own copy of non-static methods.

---

### 29) Can we overload main() method?

Yes, we can overload main() method. A Java class can have any number of main() methods. But to run the Java class, class should have main() method with signature as public static void main(String[] args). If you do any modification to this signature, compilation will be successful. But, you can’t run the Java program. You will get run time error as main method not found.

---

### 30) Can we declare main() method as private?

No, main() method must be public. You can’t define main() method as private or protected or with no access modifier. This is because to make the main() method accessible to JVM.

---

### 31) Can we declare main() method as non-static?

No, main() method must be declared as static so that JVM can call main() method without instantiating it’s class.

---

### 32) Why main() method must be static?

Suppose, if main() is allowed to be non-static, then while calling the main method JVM has to instantiate it’s class. While instantiating it has to call constructor of that class. There will be an ambiguity if constructor of that class takes an argument that what argument JVM has to pass while instantiating class containing main() method.

---

### 33) Can we change the return type of a main() method?

No, the return type of main() method must be void only.

---

### 35) What are access modifiers in Java?

These are the modifiers which are used to restrict the visibility of a class or a field or a method or a constructor. Java supports 4 access modifiers.

a) private : private fields or methods or constructors are visible within the class in which they are defined.

b) protected : Protected members of a class are visible within the package but they can be inherited to sub classes outside the package.

c) public : public members are visible everywhere.

d) default or No-access modifiers : Members of a class which are defined with no access modifiers are visible within the package in which they are defined.

(For more info on access modifiers, click here.)

---

### 36) What are non-access modifiers in Java?

These are the modifiers which are used to achieve the functionalities other than the accessibility. For example,

a) static : This modifier is used to specify whether a member is a class member or an instance member.

b) final : It is used to restrict the further modification of a class or a method or a field. (for more on final, click here).

c) abstract : abstract class or abstract method must be enhanced or modified further. (For more on abstract,  click here).

d) synchronized : It is used to achieve thread safeness. Only one thread can execute a method or a block which is declared as synchronized at any given time. (for more on synchronized, click here.)

(For more info on access Vs non-access modifiers, click here)

---

### 37) Can a method or a class be final and abstract at the same time?

No, it is not possible. A class or a method can not be final and abstract at the same time. final and abstract are totally opposite in nature. final class or final method must not be modified further where as abstract class or abstract method must be modified further.

---

### 38) Can we declare a class as private?

We can’t declare an outer class as private. But, we can declare an inner class (class as a member of another class) as private.

---

### 39) Can we declare an abstract method as private?

No, abstract methods can not be private. They must be public or protected or default so that they can be modified further.

---

### 40) Can we use synchronized keyword with class?

No. synchronized keyword can be used either with a method or block.

---

### 41) A class can not be declared with synchronized keyword. Then, why we call classes like Vector, StringBuffer are synchronized classes?

Any classes which have only synchronized methods and blocks are treated as synchronized classes. Classes like Vector, StringBuffer have only synchronized methods. That’s why they are called as synchronized classes.

---

### 42) What is type casting?

When the data is converted from one data type to another data type

---

### 43) How many types of casting are there in Java?

a) Primitive Casting : When the data is casted from one primitive type ( like int, float, double etc… ) to another primitive type, then it is called Primitive Casting.

b) Derived Casting : When the data is casted from one derived type to another derived type, then it is called derived casting.

---

### 44) What is auto widening and explicit narrowing?

The data is implicitly casted from small sized primitive type to big sized primitive type. This is called auto-widening. i.e The data is automatically casted from byte to short, short to int, int to long, long to float and float to double..

You have to explicitly cast the data from big sized primitive type to small sized primitive type.  i.e you have to explicitly convert the data from double to float, float to long, long to int, int to short and short to byte. This is called explicit narrowing.

---

### 45) What is auto-up casting and explicit down casting?

An object of sub class type can be automatically casted to super class type. This is called auto-up casting. An object of super class type should be explicitly casted to sub class type, It is called explicit down casting.

---

### Can an int primitive type of data implicitly casted to Double derived type?

Yes, first int is auto-widened to double and then double is auto-boxed to Double.

double d = 10;     //auto-widening from int to double
  
Double D =  d;     //auto-boxing from double to Double

--- 

### 47) What is ClassCastException?

ClassCastException is an exception which occurs at run time when an object of one type can not be casted to another type. (Click here to see more on ClassCastException)

---

### 48) What is boxing and unboxing?

Wrapping of primitive content into corresponding wrapper class object is called boxing. Unwrapping the wrapper class object into corresponding primitive content is called unboxing.

--- 

### 49) What is the difference between auto-widening, auto-upcasting and auto-boxing?

Auto-widening occurs when small sized primitive type is casted to big sized primitive type. Auto-upcasting occurs when sub class type is casted to super class type. Auto-boxing occurs when primitive type is casted to corresponding wrapper class.

---

### 50) What is polymorphism in Java?

Polymorphism refers to any entity whether it is a method or a constructor or an operator which takes many forms or can be used for multiple tasks.

---

### 51) What is method overloading in Java?

When a class has more than one method with same name but different parameters, then we call those methods are overloaded. Overloaded methods will have same name but different number of arguments or different types of arguments.

---

### 52) What is the method signature? What are the things it consists of?

Method signature is used by the compiler to differentiate the methods. Method signature consist of three things.

Method name
Number of arguments
Types of arguments

---

### 53) How do compiler differentiate overloaded methods from duplicate methods?

Compiler uses method signature to check whether the method is overloaded or duplicated. Duplicate methods will have same method signatures i.e same name, same number of arguments and same types of arguments. Overloaded methods will also have same name but differ in number of arguments or else in types of arguments.

---

### 54) Can we declare one overloaded method as static and another one as non-static?

Yes. Overloaded methods can be either static or non static.

### 55) Is it possible to have two methods in a class with same method signature but different return types?

No, compiler will give duplicate method error. Compiler checks only method signature for duplication not the return types. If two methods have same method signature, straight away it gives compile time error.

---

### 56) In MyClass , there is a method called myMethod with four different overloaded forms. All four different forms have different visibility – private, protected, public and default. Is myMethod properly overloaded?

Yes. Compiler checks only method signature for overloading of methods not the visibility of methods.

---

### 57) Can overloaded methods be synchronized?

Yes. Overloaded methods can be synchronized.

---

### 58) Can we declare overloaded methods as final?

Yes, overloaded methods can be final.

---

### 60) Overloading is the best example of dynamic binding. True or false? (Skipped 59)

False. Overloading is the best example for static binding. (Click here to see what is static binding and what is dynamic binding)

---

### 61) Can overloaded method be overrided?

Yes, we can override a method which is overloaded in super class.

---

### 62) What is method overriding in Java?

Modifying a super class method in the sub class is called method overriding. Using method overriding, we can change super class method according to the requirements of sub class.

---

### 63) What are the rules to be followed while overriding a method?

There are 5 main rules you should kept in mind while overriding a method. They are,

a) Name of the method must be same as that of super class method.

b) Return type of overridden method must be compatible with the method being overridden. i.e if a method has primitive type as it’s return type then it must be overridden with primitive type only and if a method has derived type as it’s return type then it must be overridden with same type or it’s sub class types.

c) You must not reduce the visibility of a method while overriding.

d) You must not change parameter list of a method while overriding.

e) You can not increase the scope of exceptions while overriding a method with throws clause.

---

### 64) Can we override static methods? 

No, static methods can not be overridden. If we try to override them they will be hidden in the sub class.

---

### 65) What happens if we change the arguments of overriding method?

If we change the arguments of overriding method, then that method will be treated as overloaded not overridden.

---




 



