package JavaCore.LeetCode;

class Solution{
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] + nums[i+1] == target){
                return new int[]{1, i+1};
            }
        }
        return new int[]{};   // if don't match with target
    }
}

public class Day1Leet {

    public static void main(String[] args){
        int[] nums = []
    }
}