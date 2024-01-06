package leetcode.arrays.arrays4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q6LengthOfLargestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int result = 0;
        Map<Character, Integer> set = new HashMap<>();
        int n = s.length();
        int l=0;
        int r=0;
        while(r<n){
            if(set.containsKey(s.charAt(r))){
                l = Math.max(set.get(s.charAt(r))+1,l);
            }

            set.put(s.charAt(r), r);
            result = Math.max(result, r-l+1);
            r++;

        }

        return result;
    }
}
