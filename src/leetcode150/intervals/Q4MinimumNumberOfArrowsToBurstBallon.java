package leetcode150.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Q4MinimumNumberOfArrowsToBurstBallon {

    public int findMinArrowShots(int[][] points) {


        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int prevStart = points[0][0];
        int prevEnd = points[0][1];
        int count = 1;
        for(int i =1;i< points.length ;i++){
            int currentStart = points[i][0];
            int currentEnd = points[i][1];

            if(currentStart>prevEnd){
                count++;
                prevStart = currentStart;
                prevEnd = currentEnd;
            } else {
                prevStart = Math.max(prevStart, currentStart);
                prevEnd = Math.min(prevEnd, currentEnd);
            }
        }

        return count;

    }

}
