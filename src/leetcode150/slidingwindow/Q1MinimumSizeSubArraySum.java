package leetcode150.slidingwindow;

public class Q1MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i =0;
        int j =0;
        int currSum = nums[0];
        int min = Integer.MAX_VALUE;

        boolean found = false;

        while (i<n && j<n && i<=j){
            if(currSum>=target){
                min = Math.min(min, j-i+1);
                found = true;
                currSum-=nums[i];
                i++;
            } else {
                j++;
                if(j<n) {
                    currSum += nums[j];
                }
            }
        }

        if(found){
            return min;
        }
        return 0;

    }
}
