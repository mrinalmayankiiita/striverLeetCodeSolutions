package leetcode150.intervals;

import java.util.ArrayList;
import java.util.List;

public class Q1SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0) return ans;
        int startNumber = nums[0];
        int endNumber = nums[0];
        for(int i = 1; i<nums.length ;i++){
            if(nums[i]-nums[i-1]==1){
                endNumber = nums[i];
            } else {
                if(startNumber==endNumber){
                    ans.add(Integer.toString(endNumber));
                }else {
                    ans.add(startNumber+"->"+endNumber);
                }

                startNumber = nums[i];
                endNumber = nums[i];
            }
        }
        if(startNumber==endNumber){
            ans.add(Integer.toString(endNumber));
        }else {
            ans.add(startNumber+"->"+endNumber);
        }

        return ans;

    }
}
