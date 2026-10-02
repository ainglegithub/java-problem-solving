package practice.constructors;

// Parent Class
class Person {
    String nationality;

    // Parent Constructor
    public Person(String nationality) {
        this.nationality = nationality;
    }
}

// Child Class extending Person
public class Student extends Person {
    private String name;
    private int age;
    private String course;

    // 1. Parameterized Constructor (Main Initialization)
    public Student(String name, int age, String course, String nationality) {
        super(nationality); // Invokes Parent class constructor
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // 2. No-Arg Constructor (Uses Constructor Chaining with this())
    public Student() {
        this("Unassigned", 18, "General Science", "Indian"); // Calls Parameterized Constructor
    }

    // 3. Constructor Overloading (Fewer Parameters)
    public Student(String name, int age) {
        this(name, age, "Computer Science", "Indian"); // Chaining
    }

    // 4. Copy Constructor
    public Student(Student other) {
        this(other.name, other.age, other.course, other.nationality);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age +
                " | Course: " + course + " | Nationality: " + nationality);
    }

    public static void main(String[] args) {
        System.out.println("--- 1. No-Arg Constructor ---");
        Student s1 = new Student();
        s1.displayInfo();

        System.out.println("\n--- 2. Parameterized Constructor ---");
        Student s2 = new Student("Alice", 21, "Data Science", "American");
        s2.displayInfo();

        System.out.println("\n--- 3. Overloaded Constructor ---");
        Student s3 = new Student("Bob", 22);
        s3.displayInfo();

        System.out.println("\n--- 4. Copy Constructor ---");
        Student s4 = new Student(s2); // Copies s2
        s4.displayInfo();
    }
}