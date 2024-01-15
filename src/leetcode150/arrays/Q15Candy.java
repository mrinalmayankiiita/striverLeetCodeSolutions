package leetcode150.arrays;

import java.util.Arrays;

public class Q15Candy {
    public int candy(int[] ratings) {
        int totalSum = 0;
        int n = ratings.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);

        for(int i =1;i < n; i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }

        for(int i =n-2;i >=0; i--){
            if(ratings[i]>ratings[i+1]){
                if(arr[i]<=arr[i+1]){
                    arr[i]=arr[i+1]+1;
                }
            }
        }

        for (int a : arr) {
            totalSum+=a;
        }
        return totalSum;
    }
}
