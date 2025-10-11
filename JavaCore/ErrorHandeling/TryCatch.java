package JavaCore.ErrorHandeling;

public class TryCatch {
    public static void main(String[] args){
    }
}

class tryCatch{
    int result;
    void trycatch(int result){
        try{
            this.result = 36/0;
        }catch(ArithmeticException e){
            System.out.println();
        }
    }
}
