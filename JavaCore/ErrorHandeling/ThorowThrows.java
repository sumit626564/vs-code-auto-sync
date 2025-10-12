package JavaCore.ErrorHandeling;

import java.util.Scanner;

public class ThorowThrows {
    public static void main(String[] args){
        ThrowExample NewThrow = new ThrowExample();
        try{
            NewThrow.divide((13), 0);  // Will throw an exception
        }catch(ArithmeticException e){
            System.out.println("Caught Exception: "+ e.getMessage());
        }

        // Example 2
        ThrowExampleTwo NewExampleTwo = new ThrowExampleTwo();
        try{
            NewExampleTwo.checkAge(16);
        }catch(ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }

        // ThrowExample3 {throw = throws}
        ThrowExampleThree NewExampleThree = new ThrowExampleThree();
        Scanner userinput = new Scanner(System.in);
        try{
            System.out.println("Dear Alex Enter YourInput: ");
            int exmaple = userinput.nextInt();
            NewExampleThree.checkNumber(exmaple);
        }catch (ArithmeticException e){
            System.out.println("Handled: "+ e.getMessage());
        }
        System.out.println("Program continues....");

        // input close is very important if not closed your  input might be leaked
        userinput.close();
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
        if(age>18){
            throw new ArithmeticException("You are not elegible to vote..!");
        }else{
            System.out.println("You can vote!");
        }
    }
}


// Example3 -- Using throw + throws
class ThrowExampleThree{
    void checkNumber(int num) throws ArithmeticException{
        if(num <0){
            throw new ArithmeticException("Negative number not allowed...!");
        }else{
            System.out.println("Positive number: "+ num);
        }
    }
}