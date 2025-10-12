package JavaCore.ErrorHandeling;

public class ThorowThrows {
    public static void main(String[] args){
        ThrowExample NewThrow = new ThrowExample();
        NewThrow.divide((13), 0);  // Will throw an exception
    }
}
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
