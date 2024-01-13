package leetcode150;

public class Q9JumpGame {
    public boolean canJump(int[] nums) {
        int maxIndexToReach = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(maxIndexToReach>=n-1){
                return true;
            }
            if(nums[i]==0){
                if(maxIndexToReach>i){
                    continue;
                } else {
                    return false;
                }
            } else {
                maxIndexToReach = Math.max(maxIndexToReach, i+nums[i]);
            }

        }
        return true;
    }
}
