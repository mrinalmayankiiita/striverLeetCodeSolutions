package leetcode150;

public class Q13ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preProduct = new int[n];
        int[] postProduct = new int[n];

        preProduct[0]=nums[0];
        postProduct[n-1]=nums[n-1];
        for(int i = 1; i<n ;i++){
            preProduct[i]=nums[i]*preProduct[i-1];
            postProduct[n-i-1]=nums[n-i-1]*postProduct[n-i];
        }
        int[] res = new int[n];

        for(int i =0;i<n;i++){
            int left = 1;
            int right = 1;
            if(i-1>=0) left = preProduct[i-1];
            if(i+1<=n-1) right = postProduct[i+1];
            res[i] = left*right;
        }

        return res;

    }
}
