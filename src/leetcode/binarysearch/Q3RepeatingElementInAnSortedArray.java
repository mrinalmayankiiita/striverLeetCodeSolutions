package leetcode.binarysearch;

public class Q3RepeatingElementInAnSortedArray {
    public int singleNonDuplicate(int[] nums) {

        int l =0;
        int r= nums.length-1;
        if(nums.length%2==0){
            return -1;
        }

        while (l<=r){

            int mid = (l+r)/2;
            if(mid == 0 || mid == nums.length-1){
                return nums[mid];
            }
            if(nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid]){
                return nums[mid];
            } else if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    r= mid-1;
                } else if(nums[mid]==nums[mid+1]) {
                    l= mid+1;
                }
            } else {
                if(nums[mid]==nums[mid-1]){
                    l= mid+1;
                } else if(nums[mid]==nums[mid+1]) {
                    r= mid-1;
                }
            }
        }
        return -1;

    }
}
