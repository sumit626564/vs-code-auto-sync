package JavaCore.Recursion;

class IncreasingDecreasing{
    public void Decreasing(int downward){
        // Base condition: stop when downward reaches 0(zero)
        if( downward  == 0){
            return; // stop recrusion
        }
        System.out.print(downward + ", ");
        Decreasing(downward - 1);   // recursive call 
    }

    public void Increasing(int upward){
        // Base Condition: stop when upward reaches 0(zero)
        if( upward > 10){
            return; // stop
        }
        System.out.println(upward + ", ");
        Increasing(upward + 1);
    }
}
public class DecreasingOrde {
    
    public static void main(String[] args) {
        IncreasingDecreasing  NewIncreasingOrder = new IncreasingDecreasing();
        NewIncreasingOrder.Decreasing(10);
        NewIncreasingOrder.Increasing(10);
        System.out.println();  // for a clean new line after output
    }
}