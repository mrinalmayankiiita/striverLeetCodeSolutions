package leetcode150.slidingwindow;

import java.util.Arrays;

public class Q4MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        String lowerCaseS = s.toLowerCase();
        String lowerCaseT = t.toLowerCase();
        int[] tSnap = new int[26];
        Arrays.fill(tSnap, 0);

        for (char c : lowerCaseT.toCharArray()) {
            tSnap[c-'a'] +=1;
        }

        int[] cSnap = new int[26];
        Arrays.fill(cSnap, 0);

        int n = lowerCaseS.length();
        int i =0, j =0, min = Integer.MAX_VALUE;
        String result = "";
        if(presentInT(lowerCaseS.charAt(i), tSnap)){
            cSnap[lowerCaseS.charAt(i)-'a']+=1;
        }
        while (i<n && j<n){
            while (!presentInT(lowerCaseS.charAt(i), tSnap)){
                i++;
                if(presentInT(lowerCaseS.charAt(i), tSnap)){
                    cSnap[lowerCaseS.charAt(i)-'a']+=1;
                }
            }

            if(i>=j) j = i+1;
            if(presentInT(lowerCaseS.charAt(j), tSnap)){
                cSnap[lowerCaseS.charAt(j)-'a']+=1;
            }
            while (!presentInT(lowerCaseS.charAt(j), tSnap)){
                j++;
                if(presentInT(lowerCaseS.charAt(j), tSnap)){
                    cSnap[lowerCaseS.charAt(j)-'a']+=1;
                }
            }
            if(isSnapMatching(cSnap, tSnap)){
                if(min>j-1+1){
                    min = j-1+1;
                    result = s.substring(i,j+1);
                }

                cSnap[lowerCaseS.charAt(i)-'a']-=1;
                i++;
            } else {
                j++;
            }
        }


        return result;

    }

    private boolean presentInT(char c, int[] tSnap) {
        int count = tSnap[c - 'a'];
        if(count>0){
            return true;
        }
        return false;
    }


    private boolean isSnapMatching (int[] cSnap, int[] tSnap){
        for(int i = 0;i<26 ;i++){
            if(tSnap[i]>0){
                if(cSnap[i]<tSnap[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
