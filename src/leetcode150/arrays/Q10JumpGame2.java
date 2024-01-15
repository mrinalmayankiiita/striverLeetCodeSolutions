package leetcode150.arrays;

public class Q10JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int minJump=0;
        int i=0;
        int maxIndexToJump=0;
        while (maxIndexToJump<n){
            int r = maxIndexToJump;
            for (int j = i ; j<=r && j<n; j++){
                maxIndexToJump = Math.max(maxIndexToJump, nums[j]+j);
            }
            minJump++;
            i = r+1;
            if (maxIndexToJump>=n-1){
                return minJump;
            }
        }
        return minJump;
    }
}
