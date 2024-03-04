package leetcode150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q2IsomorphicString {

    public boolean isIsomorphic1(String s, String t) {
        if(t.length()!=s.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        int n = t.length();


        for (int i = 0; i < n; i++) {
            if(map1.containsKey(t.charAt(i))){
                Character c = map1.get(t.charAt(i));
                if(c!=s.charAt(i)) return false;
            } else if (map2.containsKey(s.charAt(i))){
                Character c = map2.get(s.charAt(i));
                if(c!=t.charAt(i)) return false;
            } else {
                map1.put(t.charAt(i),s.charAt(i));
                map2.put(s.charAt(i),t.charAt(i));
            }
        }

        return true;

    }
    public boolean isIsomorphic(String s, String t) {
        if(t.length()!=s.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        int n = t.length();


        for (int i = 0; i < n; i++) {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
                return false;
            }
            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
        }

        return true;

    }
}
