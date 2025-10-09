package JavaCore.OOPs;

// Multiple Function with the same name but different parameters

public class PloyMethodOverloading {
    public static void main(String[] args) {
        Calculator  clc = new Calculator();
        System.out.println(clc.sum((float)12.5, (float)13.6));   // by default jaif you write any in decimal. java consider  see like type "Double"
        System.out.println(clc.sum(12, 12));
        System.out.println(clc.sum(12, 13, 14));

        // 

    }
}

// Method OverLoading 
class Calculator {

    // Function, but different parameter
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}


// Method Overriding

class Animal{
    void eat(){
        System.out.println("easts anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
