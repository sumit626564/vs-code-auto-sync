package JavaCore.Array;

public class DublicateRemove {
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 4, 5, 6, 7, 7, 9, 9};
        int[] arrempty = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arrempty[j] = arr[i];
                j++;
            }
        }
        arrempty[j] =  arr[arr.length-1];  // add the last element (it's always unique or end of series)
        j++;

        // print unique elements
        
    }
}
