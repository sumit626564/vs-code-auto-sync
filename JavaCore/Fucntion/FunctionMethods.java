package JavaCore.Fucntion;

/* How to write and call fucntions(methods) inside a class */

/* Basic -- Function inside class, call using object */
class Student{
    void Study(){           //  Function (method)
        System.out.println("The Student is studying...!");
    }
}

/* Function with parameters and return type */
class Calculator{
    int add(int a, int b){      // Function with parameters & return
        return a+b;
    }
}
public class FunctionMethods {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study();

        /* Function with parameters & return */
        Calculator c1 = new Calculator();
        System.out.println(("Calculator: "+ c1.add(12, 13)));
    }    
}
