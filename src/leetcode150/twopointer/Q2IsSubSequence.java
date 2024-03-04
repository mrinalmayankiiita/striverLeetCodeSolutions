package leetcode150.twopointer;

public class Q2IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;
        if(m<n) return false;
        if(n==0) return true;

        while (i<m && j<n){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            } else {
                i++;
            }
            if(j>=n){
                return true;
            }
        }
        return false;

    }
}
