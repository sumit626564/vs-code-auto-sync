package JavaCore.OOPs;

// Multiple Function with the same name but different parameters

public class PloyMethodOverloading {
    public static void main(String[] args) {
        Calculator  clc = new Calculator();
        System.out.println(clc.sum((float)12.5, (float)13.6));
        System.out.println(clc.sum(12, 12));

    }
}

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
