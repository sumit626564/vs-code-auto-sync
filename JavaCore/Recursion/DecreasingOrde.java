package JavaCore.Recursion;

class IncreasingDecreasing{
    public void Decreasing(int downward){
        if(downward == 1){
            System.out.println(downward);
        }
        System.out.print(downward+", ");
        Decreasing(downward);
    }
}
public class DecreasingOrde {
    
    public static void main(String[] args) {
        IncreasingDecreasing  NewIncreasingOrder = new IncreasingDecreasing();
        NewIncreasingOrder.Decreasing(10);
    }
}