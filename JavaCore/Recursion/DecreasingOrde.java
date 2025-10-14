package JavaCore.Recursion;

class IncreasingDecreasing{
    public void Decreasing(int downward){
        // Base condition: stop when downward reaches 0(zero)
        if( downward  == 0){
            return; // stop recrusion
        }
        System.out.print(downward + ", ");
        Decreasing(downward - 1);
    }
}
public class DecreasingOrde {
    
    public static void main(String[] args) {
        IncreasingDecreasing  NewIncreasingOrder = new IncreasingDecreasing();
        NewIncreasingOrder.Decreasing(10);
    }
}