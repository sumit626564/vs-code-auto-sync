package JavaCore.DvideCoquer;

public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int starting_index, int ending_index) {
        // Base case: if the array has only one element
        if (starting_index >= ending_index) {
            return;
        }

        int mid_index = starting_index + (ending_index - starting_index) / 2;

        // Recursive calls
        mergeSort(arr, starting_index, mid_index);       // Left part
        mergeSort(arr, mid_index + 1, ending_index);     // Right part

        // Merge both parts
        merge(arr, starting_index, mid_index, ending_index);
    }

    public static void merge(int arr[], int starting_index, int mid_index, int ending_index) {
        int temp[] = new int[ending_index - starting_index + 1];
        int i = starting_index;     // Iterator for left part
        int j = mid_index + 1;      // Iterator for right part
        int k = 0;                  // Iterator for temp array

        // Merge elements in sorted order
        while (i <= mid_index && j <= ending_index) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left side
        while (i <= mid_index) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right side
        while (j <= ending_index) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k = 0, i = starting_index; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
