package leetcode150.arrays;

public class Q4RemoveDuplicateElements2 {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1,count=1,currentRepCount=1;

        while (j<nums.length){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;
                j++;
                currentRepCount=1;
                count++;
            } else if (currentRepCount < 2){
                nums[i]=nums[i-1];
                i++;
                j++;
                currentRepCount++;
                count++;
            } else {
                j++;
            }
        }
        return count;
    }
}
