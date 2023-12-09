package leetcode.arrays.arrays4;

import java.util.*;

public class Q1TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> existingNumbers = new HashMap<>();


        for (int i = 0;i<numbers.length ;i++) {
            if(existingNumbers.containsKey(target-numbers[i])){
                result[0]= existingNumbers.get(target-numbers[i]);
                result[1]= i;
            } else {
                existingNumbers.put(numbers[i],i);
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }

    public int[] twoSumSortedArray(int[] numbers, int target) {
        int l =0;
        int h =numbers.length-1;

        int[] result = new int[2];
        while (l<h){
            if(numbers[l]+numbers[h]>target){
                h--;
            } else if (numbers[l]+numbers[h]<target){
                l++;
            } else {
                result[0]=l;
                result[1]=h;
                break;
            }
        }
        return result;
    }
}
