package JavaCore.Recursion;

public class DecreasingOrde {
    public static void DecreasingOrder(int number){
        if(number == 1){
            System.out.println(number);
            return;
        }
        System.out.print(number+", ");
        DecreasingOrder(number - 1);
    }
    public static void main(String[] args) {
        int decreasing = 10;
        DecreasingOrder(decreasing);
    }
}