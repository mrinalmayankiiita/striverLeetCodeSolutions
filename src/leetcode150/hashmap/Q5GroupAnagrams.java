package leetcode150.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Q5GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = String.valueOf(charArray);

            if(!anagrams.containsKey(sortedS)){
                anagrams.put(sortedS, new ArrayList<>());
            }
            anagrams.get(sortedS).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
