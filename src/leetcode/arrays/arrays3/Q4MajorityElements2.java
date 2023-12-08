package leetcode.arrays.arrays3;

import java.util.ArrayList;
import java.util.List;

public class Q4MajorityElements2 {

    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int mA = Integer.MIN_VALUE;
        int mB = Integer.MIN_VALUE;

        for (int num : nums) {
            if(count1==0 && num!=mB){
                count1 = 1;
                mA = num;
            } else if (count2==0 && num!=mA) {
                count2 = 1;
                mB = num;
            } else if (num == mA) {
                count1++;
            } else if (num == mB){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }


        int nBy3 = (int)(nums.length/3)+1;

        int aCountA = 0;
        int aCountB = 0;

        for (int num : nums) {
            if(num == mA) aCountA++;
            if(num == mB) aCountB++;
        }

        List<Integer> answerList = new ArrayList<>();

        if(aCountA>=nBy3){
            answerList.add(mA);
        }

        if(aCountB>=nBy3){
            answerList.add(mB);
        }

        return answerList;
    }
}
