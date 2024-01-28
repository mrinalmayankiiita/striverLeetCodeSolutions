package leetcode150.arrays;

public class Q23FindIndexOfFirstOccurranceInString {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;

    }
}
