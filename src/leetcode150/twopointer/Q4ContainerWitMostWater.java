package leetcode150.twopointer;

public class Q4ContainerWitMostWater {
    /*
     Though Solution
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;

        while (i<j){
            int area = Math.min(height[i],height[j])*(j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i]>height[j]){
                j--;
            } else if (height[i]<height[j]) {
                i++;
            } else {
                i++;
                j--;
            }
        }

        return maxArea;

    }

    /*
        Enhancement
     */
    public int maxArea1(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;

        while (i<j){
            int minHeight = Math.min(height[i],height[j]);
            maxArea = Math.max(maxArea, minHeight*(j-i));

            while (i<j && height[i]<=minHeight){
                i++;
            }

            while (i<j && height[j]<=minHeight){
                j--;
            }

        }

        return maxArea;

    }
}
