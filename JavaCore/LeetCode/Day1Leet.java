package JavaCore.LeetCode;


public class Day1Leet {

    public static void main(String[] args){
        int[] arr = {3, 2, 4};
        int target = 6;
        for(int i=0; i<arr.length -1; i++){
            if(arr[i] + arr[i+1] == target){
                System.out.println(i + "," + i+1);
            }
        }
    }
}