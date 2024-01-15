package leetcode150.arrays;

public class Q2RemoveElement {
    public int removeElement(int[] nums, int val) {
        int currPositionToFill = 0;
        int k = 0;
        for (int i = 0; i< nums.length; i++) {
            if(nums[i]!=val){
                nums[currPositionToFill]=nums[i];
                currPositionToFill++;
                k++;
            }
        }
        return k;
    }
}
