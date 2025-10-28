package JavaCore.Recursion;


class sroted{
    public static boolean isSorted(int arr[], int i) {
        if(arr[i] > arr[i+1]){   // array is not sorted terminating point
            return false;
        }
        return isSorted(arr, i+1);

    }
}
public class ArraySorted {
    public static void main(String[] args) {
        
    }
}
