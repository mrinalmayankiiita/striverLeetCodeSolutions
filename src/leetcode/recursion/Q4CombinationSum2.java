package leetcode.recursion;

import java.util.*;

public class Q4CombinationSum2 {
    // TODO: optimise this by not going on every index
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> tempSumList = new ArrayList<>();
        Arrays.sort(candidates);
        Set<List<Integer>> responseList = new HashSet<>();
        combinationSumRecurr(0, target, tempSumList, responseList, candidates);
        return new ArrayList<>(responseList);
    }

    private void combinationSumRecurr(int i, int target,
                                      List<Integer> tempSumList,
                                      Set<List<Integer>> responseList,
                                      int[] candidates) {
        if(i == candidates.length){
            if(target == 0) {
                responseList.add(new ArrayList<>(tempSumList));
            }
            return;
        }
        if(candidates[i] <= target) {
            tempSumList.add(candidates[i]);
            combinationSumRecurr(i+1, target - candidates[i], tempSumList, responseList, candidates);
            tempSumList.remove(tempSumList.size() - 1);
        }
        combinationSumRecurr(i+1, target, tempSumList, responseList, candidates);
    }
}
