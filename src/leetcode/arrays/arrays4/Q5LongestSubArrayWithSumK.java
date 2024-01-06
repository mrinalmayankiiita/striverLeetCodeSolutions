package leetcode.arrays.arrays4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q5LongestSubArrayWithSumK {
    int maxLen(int arr[], int n)
    {
        int[] prefixSum = new int[n];

        Map<Integer,Integer> integerSet = new HashMap<>();
        prefixSum[0] = arr[0];
        int maxLength = 0;
        for(int i =1; i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }



        for (int i =0 ; i< n; i++) {
            if(integerSet.containsKey(prefixSum[i])){
                maxLength = Math.max(maxLength,  i-integerSet.get(prefixSum[i]));
            } else if(prefixSum[i]==0){
                maxLength=i+1;
            }
            else {
                integerSet.put(prefixSum[i],i);
            }
        }

        return maxLength;

    }
}
