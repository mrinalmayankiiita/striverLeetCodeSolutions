package leetcode150.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q6TwoSum {
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
}
