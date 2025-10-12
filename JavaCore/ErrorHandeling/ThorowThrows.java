package JavaCore.ErrorHandeling;

public class ThorowThrows {
    public static void main(String[] args){
        ThrowExample NewThrow = new ThrowExample();
        NewThrow.divide((13), 0);  // Will throw an exception

        // Example 2
        ThrowExampleTwo NewExampleTwo = new ThrowExampleTwo();
        NewExampleTwo.checkAge(9);
    }
}

// Throw inside a method
class ThrowExample{
    void divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("You can't divide by zero!");
        }else{
            int result = a/b;
            System.out.println("Result: " + result);
        }
    }
}

// Example 2 Using {throw} with {try...catch}
// Here, we throw an exception and catch it in the same or another method

class ThrowExampleTwo{
    void checkAge(int age){
        if(age<=18){
            throw new ArithmeticException("You are not elegible to vote..!");
        }else{
            System.out.println("You can vote!");
        }
    }
}
