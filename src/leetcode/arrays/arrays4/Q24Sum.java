package leetcode.arrays.arrays4;

import java.util.*;
import java.util.stream.Collectors;

public class Q24Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> finalResult = new HashSet<>();
        Arrays.sort(nums);
        for (int i =0; i<nums.length; i++){
            for(int j = i+1; j< nums.length;j++){
                int a = nums[i];
                int b = nums[j];
                int l = j + 1;
                int h = nums.length - 1;
                long tempTarget = target - (a+b);
                List<List<Integer>> integers = twoSumSortedArray(nums, l, h, tempTarget);
                for (List<Integer> integer : integers) {
                    if (integer.size() == 2) {
                        List<Integer> candidate = List.of(a,b, integer.get(0), integer.get(1));
                        if (!finalResult.contains(candidate)) {
                            finalResult.add(candidate);
                        }
                    }
                }
            }

        }
        return finalResult.stream().collect(Collectors.toList());
    }

    public List<List<Integer>> twoSumSortedArray(int[] numbers,int l , int h, long target) {

        List<List<Integer>> result = new ArrayList<>();
        while (l<h){
            if((long)numbers[l]+(long)numbers[h]>target){
                h--;
            } else if ((long)numbers[l]+(long)numbers[h]<target){
                l++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(numbers[l]);
                temp.add(numbers[h]);
                result.add(temp);
                l++;
                h--;
            }
        }
        return result;
    }
}
