package JavaCore.Recursion;


class sroted{
    public boolean isSorted(int[] arr, int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){   // array is not sorted terminating point
            return false;
        }
        return isSorted(arr, i+1);

    }
}
public class ArraySorted {
    public static void main(String[] args) {
        sroted sr = new sroted();
        int[] arr = {1, 20, 3, 4, 5, 6};
        System.out.println("Check Array Sorted: "+ sr.isSorted(arr, 0));
    }
}
