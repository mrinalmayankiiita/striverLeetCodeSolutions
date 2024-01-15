package leetcode150.arrays;

import java.util.*;

public class Q18IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, List<Character>> byPlaceMap = new HashMap<>();

        byPlaceMap.put(0, Arrays.asList('I','V','X'));
        byPlaceMap.put(1, Arrays.asList('X','L','C'));
        byPlaceMap.put(2, Arrays.asList('C','D','M'));
        byPlaceMap.put(3, List.of('M'));
        int place = 0;

        List<String> reverseAnswerArray = new ArrayList<>();

        while (num>0){
            int t = num%10;
            List<Character> byPlace = byPlaceMap.get(place);
            if(t>=1 && t<=3){
                int times = t-1;
                Character a = byPlace.get(0);
                StringBuilder res = new StringBuilder(String.valueOf(byPlace.get(0)));
                appendForward(res, a , times);
                reverseAnswerArray.add(res.toString());
            } else if (t==4) {
                String res = String.valueOf(byPlace.get(0))+ byPlace.get(1);
                reverseAnswerArray.add(res);
            } else if (t>=5 && t<=8) {
                int times = t-5;
                Character a = byPlace.get(0);
                StringBuilder res = new StringBuilder(String.valueOf(byPlace.get(1)));
                appendForward(res, a , times);
                reverseAnswerArray.add(res.toString());
            } else if (t==9){
                String res = String.valueOf(byPlace.get(0))+ byPlace.get(2);
                reverseAnswerArray.add(res);
            }
            num=num/10;
            place++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = reverseAnswerArray.size()-1;i>=0;i--){
            stringBuilder.append(reverseAnswerArray.get(i));
        }

        return stringBuilder.toString();

    }

    private void appendForward(StringBuilder res, Character a, int times) {
        res.append(String.valueOf(a).repeat(Math.max(0, times)));
    }
}
