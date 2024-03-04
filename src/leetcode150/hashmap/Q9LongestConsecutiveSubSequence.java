package leetcode150.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Q9LongestConsecutiveSubSequence {

    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currSeq = 0;
        int seq = 0;
        for(int n : nums)
            mp.put(n, mp.getOrDefault(n, 0)+1);

        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            currSeq = 0;

            if(!(mp.containsKey(nums[i]-1))){
                currSeq++;
                while(mp.containsKey(n+1)){
                    currSeq++;
                    n++;
                }
            }
            seq = Math.max(seq, currSeq);
        }
        return seq;
    }

    public int longestConsecutive1(int[] nums) {
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
