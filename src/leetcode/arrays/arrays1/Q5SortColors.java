package leetcode.arrays.arrays1;

public class Q5SortColors {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;

        for (int num : nums) {
            if(num == 0) count0++;
            if(num == 1) count1++;
            if(num == 2) count2++;
        }

        int i = 0;
        while (count0>0){
            nums[i]=0;
            i++;
            count0--;
        }
        while (count1>0){
            nums[i]=1;
            i++;
            count1--;
        }
        while (count2>0){
            nums[i]=2;
            i++;
            count2--;
        }
    }

    public void sortColorsOnePass(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            } else if (nums[mid]==2) {
                swap(mid,high, nums);
                high--;
            }
        }
    }


    public void swap(int i, int j, int[] nums){
        if(i>=0 && i<nums.length && j>=0 && j<nums.length) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
