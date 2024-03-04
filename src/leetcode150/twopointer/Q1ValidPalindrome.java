package leetcode150.twopointer;

public class Q1ValidPalindrome {

    // O(N) extra space
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        System.out.println(stringBuilder.toString());
        return checkPalindrome(stringBuilder.toString());
    }

    private boolean checkPalindrome(String string) {
        int n = string.length();
        if(n==0) return true;
        int i = 0;
        while (i<= n/2){
            if(string.charAt(i)!= string.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }

    // O(1) extra space

    public boolean isPalindrome2(String s) {
        int n = s.length();
        int i =0;
        int j = n -1;

        while (i<j){
            while (i<n && !Character.isLetterOrDigit(s.charAt(i)) ){
                i++;
            }
            while (j>=0 && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(i<n && j>=0 && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


}
