package leetcode150;

public class Q6RotateArray {


    //approach 1
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        int arr[] = new int[length];

        for(int i = 0; i< length; i++){
            int indexToChange = (i+k)%length;
            arr[indexToChange] = nums[i];
        }

        for(int i = 0; i< length; i++){
            nums[i] = arr[i];
        }

    }

    //approach 2 , o(1) space complexity
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        int r = k%n;
        reverse(0,n-1, nums);
        reverse(0,r-1,nums);
        reverse(r,n-1,nums);
    }

    public void reverse(int i, int j, int[] arr){
        while (i<=j){
            swap(i, j, arr);
            i++;
            j--;
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
