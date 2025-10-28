package JavaCore.Recursion;

/* WAF to find the first occurence of an element in an array */

public class Occurence {
    public int FirstOccurrnce(int[] arr, int key, int index){
        /*
        * if our arr.length == index we will return -1; 
        * Base Condition
        */

        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        /* 
         * if i we don't found the  key on the first index 
         * then we call FirstOccurrence
        */
        return FirstOccurrence(arr, key, index+1);
    }

    public static void main(String[] args) {
        Occurence occur = new Occurence();
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(occur.FirstOccurrnce(arr, 5, 0));
    }    
}
