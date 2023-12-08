package leetcode.arrays.arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2PascalsTriangleBuild {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();

        if (numRows == 0) {
            return finalList;
        }
        finalList.add(Collections.singletonList(1));
        if (numRows == 1) {
            return finalList;
        }
        finalList.add(Arrays.asList(1, 1));
        if (numRows == 2) {
            return finalList;
        }
        int i = 2;
        for (; i < numRows; i++) {
            List<Integer> subArray = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    subArray.add(1);
                } else {
                    subArray.add(finalList.get(i - 1).get(j - 1) + finalList.get(i - 1).get(j));
                }
            }
            finalList.add(subArray);
        }

        return finalList;
    }
}
