package leetcode.arrays.arrays1;


public class Q4MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum = Integer.max(nums[i], currSum+nums[i]);
            maxSum = Integer.max(currSum,maxSum);
        }
        return maxSum;
    }
}
