package JavaCore.DvideCoquer;

public class quickSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int starting_index, int ending_index){
        // last element
        int piviot_index = partition(arr, starting_index, ending_index);
        quickSort(arr, starting_index, piviot_index-1);  // left index
        quickSort(arr, piviot_index+1, ending_index); // right index
    }

    public static int partition(int arr[], int starting_index, int ending_index){
        
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
    }
}
