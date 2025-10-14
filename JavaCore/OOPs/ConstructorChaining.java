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
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        
    }
}
