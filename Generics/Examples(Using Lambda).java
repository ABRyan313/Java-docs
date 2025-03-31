import java.util.*;
import java.util.function.Predicate;

// Step 1: Define Person class
class Person {
    enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private Sex gender;

    public Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public Sex getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + age + " years)";
    }
}

// Step 2: Define Functional Interface CheckPerson
interface CheckPerson {
    boolean test(Person p);
}

// Step 3: Method using CheckPerson
class PersonFilter {
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }

    // Step 4: Method using Predicate<Person>
    public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }
}

// Step 5: Main Method
public class LambdaDemo {
    public static void main(String[] args) {
        // Sample list of people
        List<Person> people = Arrays.asList(
            new Person("Alice", 22, Person.Sex.FEMALE),
            new Person("Bob", 19, Person.Sex.MALE),
            new Person("Charlie", 25, Person.Sex.MALE),
            new Person("David", 30, Person.Sex.MALE),
            new Person("Eve", 18, Person.Sex.FEMALE)
        );

        System.out.println("Using CheckPerson Functional Interface:");
        PersonFilter.printPersons(
            people,
            p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
        );

        System.out.println("\nUsing Predicate<Person> Functional Interface:");
        PersonFilter.printPersonsWithPredicate(
            people,
            p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
        );
    }
}
