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

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial: "+fact(n));
        System.out.println("=======================");
        System.out.println("The Natural Number: "+ NaturalNumber(n));
        System.out.println("=======================");
    }
}
