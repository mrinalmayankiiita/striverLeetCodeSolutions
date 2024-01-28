package leetcode150.arrays;

public class Q19FindLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ' && i - 1 >= 0 && s.charAt(i - 1) == ' ') {
                count = 1;
            } else if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
