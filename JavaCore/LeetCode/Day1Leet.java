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
    public int[] AddTwoNumbers(int[] NodeOne, int[] NodeTwo){
        
    }
}

public class Day1Leet {

    public static void main(String[] args){
        int[] nums = {3,2,3};
        int target = 6;
        ProblemOne sl = new ProblemOne();
        int[] result = sl.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}