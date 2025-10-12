package JavaCore.Fucntion;

/* How to write and call fucntions(methods) inside a class */

class Student{
    void Study(){           //  Function (method)
        System.out.println("The Student is studying...!");
    }
}

public class FunctionMethods {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study();
    }    
}
