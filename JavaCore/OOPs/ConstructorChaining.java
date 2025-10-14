package JavaCore.OOPs;

/* Constructor Chaining in Java means calling one constructor from another constructor within the same class or from a parant class 
 *  
 * Note:- It helps to avoid code duplicate and makes the initialization process more organixed and resuable.
 * 
 *  Two Types of Constructor Chaining.
 *                      (+) Within the same class------------------> using this()
 *                      (+) From parent class (superclass)---------> using super()
*/

/* Constructor Chaining in the Same Class this() */

class Student{
    String name;
    int age;
    String course;
    
    // Constructor 1
    Student(){
        this("Unknown", 18); // calling constructor 2
        System.out.println("Default Constructor Callled");
    }

    // Constructor 2
    Student(String name, int age){
        this(name, age, "Not Assigned");  // calling constructor 3
        System.out.println("Two-Parameter Costructor Called");
    }

    // Constructor 3
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-Parameter Constructor Called");
    }
    void display(){
        System.out.println("Name: "+ name + ", Age: "+ age + ", Course: "+ course);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
