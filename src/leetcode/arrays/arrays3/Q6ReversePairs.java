package leetcode.arrays.arrays3;

import java.util.ArrayList;

public class Q6ReversePairs {
    public int reversePairs(int nums[]) {

        int low = 0;
        int high = nums.length-1;

        return mergeSort(nums, low, high);
        // Write your code here.
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return 0;
        int mid = (low + high) / 2 ;
        count += mergeSort(arr, low, mid);  // left half
        count += mergeSort(arr, mid + 1, high); // right half
        count += countIn2Arrays(arr, low, mid, high);
        merge(arr, low, mid, high);// merging sorted halves

        return count;
    }

    private static int countIn2Arrays(int[] arr, int low, int mid, int high) {
        int r = mid+1;
        int count = 0;

        for(int i =low ;i<=mid ;i++){
            while(r<=high && (long)arr[i]>2*(long)arr[r]){
                r++;
            }
            count+= r-(mid+1);

        }
        return count;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
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

    }

}
