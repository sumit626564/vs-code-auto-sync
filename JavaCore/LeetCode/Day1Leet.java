package JavaCore.LeetCode;
import java.util.Arrays;

class ProblemOne{
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j+1};
                }
            }
        }
        return new int[]{};   // if don't match with target
    }
}

class ProblemTwo{
    int[] arrone;
    int[] arrtwo;

    public ProblemTwo(int[] arrone, int[] arrtwo){
        this.arrone = arrone;
        this.arrtwo = arrtwo;
    }

    //=================================================
    public int[][] Reverse(){
        int assume = arrone.length;
        int start = 0;
        int end = assume-1;
        while(start<end){
            int tempone = arrone[start];
            arrone[start] = arrone[end];
            arrone[end] = tempone;
            //===========================
            int temptwo = arrtwo[start];
            arrtwo[start] = arrtwo[end];
            arrtwo[end] = temptwo;
            start++;
            end--;
        }
        return new int[][]{arrone, arrtwo};
    }
    //==========================================
    public int[]  AddReverse(){
        int[][] sumArr = super.Reverse(arrone, arrtwo);
        int assume = arrone.length;
        int start = 0;
        int end = assume-1;
        while (start<end) {
            int temp = 
        }
    }
}

public class Day1Leet {

    public static void main(String[] args){
        int[] nums = {3,2,3};
        int target = 6;
        ProblemOne sl = new ProblemOne();
        int[] result = sl.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        //=============================================
    }
}