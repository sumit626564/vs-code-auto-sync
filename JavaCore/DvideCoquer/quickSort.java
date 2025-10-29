package JavaCore.DvideCoquer;

public class quickSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int starting_index, int ending_index){
        if(starting_index>=ending_index){
            return;
        }
        // last element
        int piviot_index = partition(arr, starting_index, ending_index);
        quickSort(arr, starting_index, piviot_index-1);  // left index
        quickSort(arr, piviot_index+1, ending_index); // right index
    }

    public static int partition(int arr[], int starting_index, int ending_index){
        int pivot = arr[ending_index];
        int i =  starting_index-1; // to make place for els smaller than pivot
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
    }
}
