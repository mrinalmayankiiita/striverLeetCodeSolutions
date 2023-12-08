package leetcode.arrays.arrays3;

public class Q1SearchInSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {



        int rowToSearch = findNumberLessOrEquals(matrix, target);
        if(rowToSearch == -1){
            return false;
        }


        return binarySearch(matrix, rowToSearch, target);

    }

    private boolean binarySearch(int[][] matrix, int rowToSearch, int target) {
        int l = 0;
        int h = matrix[rowToSearch].length-1;

        while (l<=h){
            int mid = l + (h-l)/2;
            if(matrix[rowToSearch][mid]==target){
                return true;
            } else if (matrix[rowToSearch][mid]>target){
                h=mid-1;
            } else {
                l = mid+1;
            }
        }
        return false;

    }

    private int findNumberLessOrEquals(int[][] matrix, int target){
        int l = 0;
        int h = matrix.length-1;

        int ans = -1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if(matrix[mid][0]<=target){
                ans = mid;
                l = mid+1;
            } else {
                h = mid-1;
            }
        }
        return ans;
    }
}
