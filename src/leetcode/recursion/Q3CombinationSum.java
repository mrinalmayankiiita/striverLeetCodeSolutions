package leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Q3CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> tempSumList = new ArrayList<>();
        List<List<Integer>> responseList = new ArrayList<>();
        combinationSumRecurr(0, target, tempSumList, responseList, candidates);
        return responseList;
    }

    private void combinationSumRecurr(int i, int target,
                                      List<Integer> tempSumList,
                                      List<List<Integer>> responseList,
                                      int[] candidates) {
        if(i == candidates.length){
            if(target == 0) {
                responseList.add(new ArrayList<>(tempSumList));
            }
            return;
        }
        if(candidates[i] <= target) {
            tempSumList.add(candidates[i]);
            combinationSumRecurr(i, target - candidates[i], tempSumList, responseList, candidates);
            tempSumList.remove(tempSumList.size() - 1);
        }
        combinationSumRecurr(i + 1, target, tempSumList, responseList, candidates);
    }
}
