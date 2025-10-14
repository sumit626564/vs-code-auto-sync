package JavaCore.OOPs;

/* Constructor Chaining in Java means calling one constructor from another constructor within
 * the same class or from a parent class.
 * 
 * Note: It helps to avoid code duplication and makes the initialization process more organized and reusable.
 * 
 * Two Types of Constructor Chaining:
 *      (+) Within the same class -----------------> using this()
 *      (+) From parent class (superclass) --------> using super()
 */

/* Constructor Chaining in the Same Class using this() */

class Teacherstu{
    String name;
    int age;
    String course;

    // Constructor 1
    Teacherstu() {
        this("Unknown", 18); // calling constructor 2
        System.out.println("Default Constructor Called");
    }

    // Constructor 2
    Teacherstu(String name, int age) {  // ✅ fixed comma
        this(name, age, "Not Assigned"); // calling constructor 3
        System.out.println("Two-Parameter Constructor Called");
    }

    // Constructor 3
    Teacherstu(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-Parameter Constructor Called");
    }

    void FileDisplay() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Teacherstu s1 = new Teacherstu();
        s1.FileDisplay();
    }
}
