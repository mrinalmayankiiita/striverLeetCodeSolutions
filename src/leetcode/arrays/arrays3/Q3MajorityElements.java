package leetcode.arrays.arrays3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Q3MajorityElements {
    public int majorityElement(int[] nums) {
        int max = -1;
        int maxElement = -1;
        Map<Integer, Integer> countByNumber = new HashMap<>();
        for (int num : nums) {
            Integer count = 1;
            if(java.util.Objects.nonNull(countByNumber.get(num))){
                Integer mapCount = countByNumber.get(num);
                count+= mapCount;
            }
            countByNumber.put(num, count);
            if(count> max){
                max = count;
                maxElement = num;
            }
        }
        return maxElement;
    }

    public int majorityElementO1Space(int[] nums) {
        int count = 1;
        int maxElement = nums[0];
        for( int i = 1 ;i< nums.length ; i++ ){
            if(nums[i]== maxElement){
                count++;
            } else {
                count--;
            }

            if(count==0){
                maxElement = nums[i];
                count=1;
            }
        }
        return maxElement;
    }
}
