package JavaCore.Recursion;

class NaturalNumber{
    public int NumberNatural(int naturalnumber){
        if(naturalnumber == 0){
            return 1; // stop
        }
        int stepone = NumberNatural(naturalnumber - 1);
        int steptwo = naturalnumber + stepone;
        return steptwo;
    }
}
public class SumPrimeNumber {
    public static void main(String[] args){
        NaturalNumber  newnatural = new NaturalNumber();
        System.out.println(newnatural.NumberNatural(5));
    }        
}