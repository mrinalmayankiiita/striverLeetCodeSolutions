package leetcode.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1SubSetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sumList = new ArrayList<>();
        subSetSumRecur( 0 , 0 ,arr, sumList);
        Collections.sort(sumList);
        return sumList;
    }

    private void subSetSumRecur(int index, int sum,
                                              ArrayList<Integer> arr,
                                              List<Integer> sumList) {

        if(index > arr.size()-1){
            sumList.add(sum);
            return;
        }
        subSetSumRecur(index+1, sum+arr.get(index), arr, sumList);
        subSetSumRecur(index+1, sum, arr, sumList);
    }
}
