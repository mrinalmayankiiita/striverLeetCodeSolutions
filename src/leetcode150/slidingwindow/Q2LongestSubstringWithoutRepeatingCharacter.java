package leetcode150.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Q2LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> positionByChar = new HashMap<>();
        int currMax = 0;
        int resultant = 0;
        int countingFrom = 0;

        char[] charArray = s.toCharArray();
        for (int i =0;i< s.length();i++){
            if(!positionByChar.containsKey(charArray[i])){
                currMax++;
            } else {
                int position = positionByChar.get(charArray[i]);
                if(position<countingFrom){
                    currMax++;
                } else {
                    countingFrom = position + 1;
                    currMax = (i - position);
                }
            }
            positionByChar.put(charArray[i],i);
            resultant = Math.max(currMax, resultant);
        }

        return resultant;

    }
}
