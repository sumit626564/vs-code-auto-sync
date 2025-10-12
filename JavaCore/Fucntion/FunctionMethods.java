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

/* Using {static} method (no obejct required) */
class Greeting{
    static void sayHello(){     // static method
        System.out.println("Hello Sumit");
    }
}

public class FunctionMethods {

    /* Function inside same class (calling directly) */
    void greet(){           // Non-static function
        System.out.println("Hi from greet()");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study();

        /* Function with parameters & return */
        Calculator c1 = new Calculator();
        int result = c1.add(14, 16);
        System.out.println("Second way of add: "+ result);
        System.out.println(("Frist way of add: "+ c1.add(12, 13)));

        /* Using {static} method (no object required) 
         * Note:-
         *      Use static:- when the method is not dependent ob object data.
        */
        Greeting.sayHello();    // called without object

        /* Fucntion inside same class (calling directly)*/
        FunctionMethods MainClass = new FunctionMethods();   // Create object of same class
        MainClass.greet();          // call method
    }    
}
