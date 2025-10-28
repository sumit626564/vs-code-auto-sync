package JavaCore.DvideCoquer;

public class MergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int starting_index, int ending_index){
        // work
        int mid_index = starting_index +(ending_index - starting_index)/2;  // find out the mid of the array or you can write like this (starting_index + ending_index)/2
        mergeSort(arr, starting_index, mid_index);  // left Part
        mergeSort(arr, mid_index + 1, ending_index);  // right part
        merge(arr, starting_index, mid_index, ending_index);  // assume the function are already exists

    }

    public static void merge(int arr[], int starting_index, int mid_index, int ending_index){
        /* Create first temprorary  store the data for our right and left part */ 
        int temp = 
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
    }
}
