package JavaCore.ErrorHandeling;

public class TryCatch {
    public static void main(String[] args){
        TryCatchClass TryNew =  new TryCatchClass();
        TryNew.trycatch(36);
    }
}

// try....catch

class TryCatchClass{
    int result;
    void trycatch(int resu){
        try{
            this.result = resu/0;
        }catch(ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}

// multiple catch


class MultipleCatch{
    
}
