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
        int start = 0;
        int end = arrone.length-1;
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
        for(int i=0; i<arrone.length; i++){
            arrone[i] += arrtwo[i];
        }

        // Reversed arrone (which now containes the sum)
        int start = 0;
        int end = arrone.length-1;
        while (start<end) {
            int temp = arrone[start];
            arrone[start] = arrone[end];
            arrone[end] = temp;
            start++;
            end--;
        }
        return arrone;
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

        int[] arrone = {2, 4, 3};
        int[]  arrtwo = {5, 6, 7};
        ProblemTwo  pltwo = new ProblemTwo(arrone, arrtwo);
        pltwo.Reverse();
        int[] newresult = pltwo.AddReverse();
        System.out.println(Arrays.toString(newresult));
    }
}