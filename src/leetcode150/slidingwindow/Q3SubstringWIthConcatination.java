package leetcode150.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3SubstringWIthConcatination {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();

        int i =0;
        int wordLength = words[0].length();
        int wordArrayLength = wordLength*words.length;
        Map<String, Integer> globalCountMap = new HashMap<>();
        refreshMap(globalCountMap, words);

        while (i<= s.length()-wordArrayLength){

            Map<String, Integer> seen = new HashMap<>();

            int currentCount = 0;
            while (currentCount<wordArrayLength){
                String substring = s.substring(i+currentCount, i+currentCount+wordLength);
                Integer orDefault = seen.getOrDefault(substring, 0)+1;
                seen.put(substring, orDefault);
                if(!globalCountMap.containsKey(substring)) break;
                if(seen.get(substring)>globalCountMap.get(substring)){
                    break;
                } else {
                    currentCount+=wordLength;
                }
                if(currentCount==wordArrayLength){
                    answer.add(i);
                }
            }
            i++;
        }

        return answer;

    }

    private void refreshMap(Map<String, Integer> isUsed, String[] words) {
        for (String word : words) {
            if(isUsed.containsKey(word)) {
                Integer i = isUsed.get(word);
                i++;
                isUsed.put(word, i);
            } else {
                isUsed.put(word, 1);
            }
        }
    }
}
