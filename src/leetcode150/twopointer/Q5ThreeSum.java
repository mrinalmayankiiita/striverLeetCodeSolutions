package leetcode150.twopointer;

import java.util.*;
import java.util.stream.Collectors;

public class Q5ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> finalResult = new HashSet<>();
        Arrays.sort(nums);
        for (int i =0; i<nums.length; i++){
            int a = nums[i];
            int l = i+1;
            int h = nums.length-1;
            int target = 0-a;
            List<List<Integer>> integers = twoSumSortedArray(nums, l, h, target);
            for (List<Integer> integer : integers) {
                if(integer.size()==2) {
                    List<Integer> candidate = List.of(a, integer.get(0), integer.get(1));
                    if(!finalResult.contains(candidate)){
                        finalResult.add(candidate);
                    }
                }
            }

        }
        return finalResult.stream().collect(Collectors.toList());
    }

    public List<List<Integer>> twoSumSortedArray(int[] numbers,int l , int h, int target) {

        List<List<Integer>> result = new ArrayList<>();
        while (l<h){
            if(numbers[l]+numbers[h]>target){
                h--;
            } else if (numbers[l]+numbers[h]<target){
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
