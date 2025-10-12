package JavaCore.ErrorHandeling;

public class TryCatch {
    public static void main(String[] args){
        TryCatchClass TryNew =  new TryCatchClass();
        TryNew.trycatch(36);

        // multiple catch
        MultipleCatch NewMul = new MultipleCatch();
        NewMul.multi(36);

        // Try Finally
        TryFinallyClass NewFinal =  new TryFinallyClass();
        NewFinal.fina(35);

        // Trc...Catch....Finally
        TryCatchFinally trc = new TryCatchFinally();
        trc.trycatchfinally(36);

        // throw
        ThrowClass NewThrow = new ThrowClass();
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
    int finaa;
    void fina(int tryfin){
        try{
            this.finaa = tryfin / 0;
        }finally {
            this.finaa = tryfin / 6;
            System.out.println("Finally block  result: "+ finaa);
        }
    }
}

// try Catch Finally:
class TryCatchFinally{
    int tcf;
    void trycatchfinally(int tc){
        try{
            this.tcf = tc / 0;
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            this.tcf = tc / 6;
            System.out.println("Finally Block result: "+ tcf);
        }
    }
}

// throws
class ThrowClass{
    int throwresult;
    public void example(int thro) throws ArithmeticException{
        this.throwresult =  thro / 0;
    }
}