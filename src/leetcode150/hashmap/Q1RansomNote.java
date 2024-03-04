package leetcode150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q1RansomNote {
    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            if(!charCount.containsKey(c)){
                charCount.put(c,1);
            } else {
                Integer i = charCount.get(c);
                charCount.put(c,++i);
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if(!charCount.containsKey(c)){
                return false;
            } else {
                if(charCount.get(c)==0){
                    return false;
                } else {
                    Integer i = charCount.get(c);
                    charCount.put(c,--i);
                }
            }
        }

        return true;

    }


}
