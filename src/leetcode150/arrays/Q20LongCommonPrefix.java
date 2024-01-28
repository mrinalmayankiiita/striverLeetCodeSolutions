package leetcode150.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class Q20LongCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1)return "";
        if(strs.length==1)return strs[0];
        Arrays.sort(strs);

        StringBuilder stringBuilder = new StringBuilder();

        int n = Math.min(strs[0].length(), strs[1].length());
        for(int i=0;i< n;i++){
            if(strs[0].charAt(i)!=strs[1].charAt(i)){
                break;
            } else {
                stringBuilder.append(strs[0].charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
