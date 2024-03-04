package leetcode150.stack;

import java.util.Set;

public class Q5BasicCalculator {
    private final static Set<Character> bodmasExpressions = Set.of('+','(',')');

    public int calculate(String s) {


        s.trim();

        char[] charArray = s.toCharArray();
        int i =0;
        int n = charArray.length;

        int sum =0;

        while (i<n){
            if(!bodmasExpressions.contains(charArray[i])){
                if(charArray[i]=='-'){
                    i++;
                    sum-= charArray[i];
                } else {
                    sum+= charArray[i];
                }
            }
            i++;
        }
        return sum;
    }
}
