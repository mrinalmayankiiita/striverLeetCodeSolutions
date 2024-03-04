package leetcode150.hashmap;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : s.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : t.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        if (t.length() != s.length()) return false;
        char[] ar = t.toCharArray();
        Arrays.sort(ar);
        String sorted = String.valueOf(ar);
        return s.equals(sorted);
    }
}
