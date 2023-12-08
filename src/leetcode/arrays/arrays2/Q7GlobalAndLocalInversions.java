package leetcode.arrays.arrays2;

import java.util.ArrayList;

public class Q7GlobalAndLocalInversions {
    public boolean isIdealPermutation(int[] nums) {
        int length = nums.length;
        int localInversion =0;
        for(int i =0;i< length-1;i++){
            if(nums[i]>nums[i+1]) localInversion++;
        }
        int globalInversion = getGlobalInversionsInversions(nums, length);

        return localInversion == globalInversion;

    }

    public static int getGlobalInversionsInversions(int arr[], int n) {

        int low = 0;
        int high = n-1;

        return mergeSort(arr, low, high);
        // Write your code here.
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return 0;
        int mid = (low + high) / 2 ;
        count += mergeSort(arr, low, mid);  // left half
        count += mergeSort(arr, mid + 1, high); // right half
        count += merge(arr, low, mid, high);// merging sorted halves

        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        int inversionCount = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                inversionCount += (mid-left)+1;
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return inversionCount;
    }
}
