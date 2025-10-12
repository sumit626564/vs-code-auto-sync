package JavaCore.ErrorHandeling;

public class ThorowThrows {
    public static void main(String[] args){
        ThrowExample NewThrow = new ThrowExample();
        try{
            NewThrow.
        }
    }
}
class ThrowExample{
    void divide(int a, int b){
        if(a==b){
            throw new ArithmeticException("You are not elegible to vote!");
        }else{
            System.out.println("You can vote!");
        }
    }
}
