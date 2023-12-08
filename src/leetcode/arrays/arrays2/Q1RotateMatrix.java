package leetcode.arrays.arrays2;

public class Q1RotateMatrix {

    /*
    without using extra space.
     */
    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i<m-1;i++){
            for(int j =i+1;j<n;j++){
                swap(i,j,j,i,matrix);
            }
        }

        for(int f = 0; f<m;f++){
            reverse(matrix[f]);
        }
    }


    public void swap(int i, int j, int k, int l, int[][] matrix){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[k][l];
            matrix[k][l] = temp;
    }

    public void reverse(int[] nums){
        int i =0;
        int j = nums.length-1;
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }

    public void swap(int i, int j, int[] nums){
        if(i>=0 && i<nums.length && j>=0 && j<nums.length) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
