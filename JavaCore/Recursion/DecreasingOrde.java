package JavaCore.Recursion;

class IncreasingDecreasing{
    /*             Decreasing Order             */
    public void Decreasing(int downward){
        // Base condition: stop when downward reaches 0(zero)
        if( downward  == 0){
            return; // stop recrusion
        }
        System.out.print(downward + ", ");
        Decreasing(downward - 1);   // recursive call 
    }

    /*             Increasing Order             */
    public void Increasing(int upward){
        // Base Condition: stop when upward reaches 0(zero)
        if( upward > 10){
            return; // stop
        }
        System.out.print(upward + ", ");
        Increasing(upward + 1);
    }

    /*             Factorial Number          */
    public int FactorialNumber(int factnumber){
        if (factnumber == 0) {
            return 1;
        }
        //int fnm1 = FactorialNumber(factnumber-1);
        return factnumber * FactorialNumber(factnumber-1);
        
    }
}

public class DecreasingOrde {
    
    public static void main(String[] args) {
        IncreasingDecreasing  NewIncreasingOrder = new IncreasingDecreasing();
        System.out.print("Decreasing Order: ");
        NewIncreasingOrder.Decreasing(10);

        System.out.print("\nIncreasing Order: ");
        NewIncreasingOrder.Increasing(1); // start from 1 not 10

        System.out.print("\nFactorial Order: ");
        System.out.println(NewIncreasingOrder.FactorialNumber(5));

        System.out.println();  // for a clean new line after output
    }
}