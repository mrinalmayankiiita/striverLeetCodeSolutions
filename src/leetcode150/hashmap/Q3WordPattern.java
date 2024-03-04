package leetcode150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q3WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].trim();
        }
        int n = pattern.length();

        if(s1.length!=n) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();



        for (int i = 0; i < n; i++) {
            if(map1.containsKey(pattern.charAt(i))){
                String c = map1.get(pattern.charAt(i));
                if(!c.equals(s1[i])) return false;
            } else if (map2.containsKey(s1[i])){
                Character c = map2.get(s1[i]);
                if(c!=pattern.charAt(i)) return false;
            } else {
                map1.put(pattern.charAt(i),s1[i]);
                map2.put(s1[i],pattern.charAt(i));
            }
        }

        return true;
    }
}
