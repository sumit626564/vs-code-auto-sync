package JavaCore.Array;

public class FunArr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        acceptArray(arr);
    }
    public static void  acceptArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
