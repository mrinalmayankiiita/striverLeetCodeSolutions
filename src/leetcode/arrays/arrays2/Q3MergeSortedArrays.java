package leetcode.arrays.arrays2;

import java.util.Arrays;

public class Q3MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            for (int i = 0; i < m; i++) {
                if (nums2[0] < nums1[i]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;
                    if (n > 1) {
                        for (int j = 1; j < n; j++) {
                            if (nums2[j - 1] > nums2[j]) {
                                int temp1 = nums2[j - 1];
                                nums2[j - 1] = nums2[j];
                                nums2[j] = temp1;
//                                break; dont break wrong logic
                            }
                        }
                    }
                }
            }
            int j = 0;
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }
}
