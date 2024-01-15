package leetcode150.arrays;

import java.util.Arrays;

public class QExtra1MinNumberOfPlatforms {
    int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1;
        int maxCount = 1;
        int i = 1;
        int j = 0;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
