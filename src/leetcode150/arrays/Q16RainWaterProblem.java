package leetcode150.arrays;

public class Q16RainWaterProblem {
    public int trap(int[] height) {
        int n = height.length;
        if(n<=2){
            return 0;
        }
        int[] maxTillHereFromLeft = new int[n];
        maxTillHereFromLeft[0]=height[0];

        int[]maxTillHereFromRight = new int[n];
        maxTillHereFromRight[n-1]=height[n-1];


        for(int i = 1;i<n;i++){
            maxTillHereFromLeft[i]= Math.max(maxTillHereFromLeft[i-1],height[i]);
        }

        for(int i = n-2;i>=0;i--){
            maxTillHereFromRight[i]= Math.max(maxTillHereFromRight[i+1],height[i]);
        }

        int sum=0;
        for (int i =1;i<n-1;i++){
            if(maxTillHereFromLeft[i-1]>height[i] && maxTillHereFromRight[i+1]>height[i]){
                sum+= Math.min(maxTillHereFromLeft[i-1], maxTillHereFromRight[i+1])-height[i];
            }
        }
        return sum;

    }
}
