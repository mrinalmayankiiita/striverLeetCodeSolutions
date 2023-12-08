package leetcode.arrays.arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q2MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] currentInterval = intervals[0];
        List<int[]> resultantInterval = new ArrayList<>();
        resultantInterval.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(interval[1], currentInterval[1]);
            } else {
                currentInterval = interval;
                resultantInterval.add(currentInterval);
            }
        }
        return resultantInterval.toArray(new int[resultantInterval.size()][]);
    }
}
