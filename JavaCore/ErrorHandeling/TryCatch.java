package JavaCore.ErrorHandeling;

public class TryCatch {
    public static void main(String[] args){
        TryCatchClass TryNew =  new TryCatchClass();
        TryNew.trycatch(36);

        // multiple catch
        MultipleCatch NewMul = new MultipleCatch();
        NewMul.multi(36);
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
    int mul;
    public void multi(int mu){
        try{
            this.mul = mu / 0;
        } catch(NullPointerException e1){
            System.out.println("Error: "+ e1.getMessage());
        }catch(ArithmeticException e2){
            System.out.println("Error mu: "+e2.getMessage());
        }
    }
}

// tryfinally

class TryFinallyClass{
    void finally(int)
}
