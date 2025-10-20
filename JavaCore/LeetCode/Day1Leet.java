package JavaCore.LeetCode;
import java.util.Arrays;

class Solution{
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] + nums[i+1] == target){
                return new int[]{i, i+1};
            }
        }
        return new int[]{};   // if don't match with target
    }
}

public class Day1Leet {

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution sl = new Solution();
        int[] result = sl.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}