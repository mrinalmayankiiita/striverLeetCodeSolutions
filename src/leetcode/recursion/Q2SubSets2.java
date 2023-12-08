package leetcode.recursion;

import java.util.*;

public class Q2SubSets2 {

    //TODO: redo solution not correct
    List<List<Integer>> subsetsWithDup(int[] arr){
        // code here
        Set<List<Integer>> sumList = new HashSet<>();
        Arrays.sort(arr);
        List<Integer> sum = new ArrayList<>();
        subSetSumRecur( 0 , sum ,arr, sumList);
        return new ArrayList<>(sumList);
    }

    private void subSetSumRecur(int index, List<Integer> sum,
                                int[] arr,
                                Set<List<Integer>> actualList) {

        if(index > arr.length -1){
            actualList.add(sum);
            return;
        }
        sum.add(arr[index]);
        subSetSumRecur(index+1, sum, arr, actualList);
        sum.remove(sum.size()-1);
        subSetSumRecur(index+1, sum, arr, actualList);
    }
}
