package JavaCore.ErrorHandeling;

public class TryCatch {
    public static void main(String[] args){
        tryCatch TryNew =  new tryCatch();
        TryNew.trycatch(36);
    }
}

class tryCatch{
    int result;
    void trycatch(int resu){
        try{
            this.result = resu/0;
        }catch(ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
