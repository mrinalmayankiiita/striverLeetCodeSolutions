package leetcode150.arrays;

import java.util.Arrays;

public class Q11HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        int h = 0;

        if(n==1){
            if(citations[0]>0)return 1;
            else return 0;
        }

        for (int i =0;i<n;i++){
            h = Math.max(h, Math.min(citations[i], n-i));
        }

        return h;

    }
}
