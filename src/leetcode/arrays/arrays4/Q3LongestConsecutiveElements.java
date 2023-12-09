package leetcode.arrays.arrays4;

import java.util.Arrays;

public class Q3LongestConsecutiveElements {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int currentLong = 1;
        int longestTillNow = currentLong;
        for(int i =1;i<nums.length ;i++){
            if(nums[i]-nums[i-1]==1){
                currentLong++;
            } else if (nums[i]-nums[i-1]==0){
                continue;
            }else{
                currentLong = 1;
            }
            longestTillNow = Math.max(currentLong, longestTillNow);
        }
        return longestTillNow;
    }
}
