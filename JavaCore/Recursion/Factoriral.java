package JavaCore.Recursion;

public class Factoriral {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    public static int NaturalNumber(int n){
        if(n==1){
            return 1;
        }
        int natural = n + NaturalNumber(n-1);
        return natural;
    }

    public static int Fibonacci(int n){
        if(n==0 || n == 1){
            return n;
        }
        int fbn1 = Fibonacci(n-1); // 1
        int fbn2 = Fibonacci(n-2); // 1
        int fbn = fbn1 + fbn2;
        return fbn;

    }
    public static void main(String[] args) {
        int n = 5000;
        System.out.println("The factorial: "+fact(n));
        System.out.println("=======================");
        System.out.println("The Natural Number: "+ NaturalNumber(n));
        System.out.println("=======================");
        System.out.println("Fibonacci: "+ Fibonacci(n));
    }
}
