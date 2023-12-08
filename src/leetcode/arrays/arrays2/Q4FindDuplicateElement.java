package leetcode.arrays.arrays2;

import java.util.Arrays;

public class Q4FindDuplicateElement {
    public int findDuplicate(int[] nums)  {
        for(int i = 0 ;i< nums.length ;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                return Math.abs(nums[i]);
            } else{
                nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1]*(-1);
            }
        }
        return 0;
    }

    /*
     try this https://leetcode.com/problems/first-missing-positive/description/ - hard
     */

    public int[] findDuplicateHard(final int[] A)  {
        int missing = 0;
        int repeated = 0;
        for(int i = 0 ;i< A.length ;i++){
            if(A[Math.abs(A[i])-1]<0){
                missing = Math.abs(A[i]);
            } else{
                A[Math.abs(A[i])-1] = A[Math.abs(A[i])-1]*(-1);
            }
        }

        for(int i = 0 ;i< A.length ;i++){
            if(A[i]>0){
                repeated = i+1;
            }
        }
        return new int[]{missing, repeated};
    }
}
