package leetcode150.arrays;

import java.util.Stack;

public class Q21ReverseWordsInString {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();

        StringBuilder currentStringBuilder = new StringBuilder();
        StringBuilder resultantStringBuilder = new StringBuilder();

        for(int i = 0 ;i < s.length() ; i++){
            if(s.charAt(i)==' ' && i - 1 >= 0 && s.charAt(i - 1) != ' '){
                stack.push(currentStringBuilder.toString());
                currentStringBuilder = new StringBuilder();
            } else if (s.charAt(i)!=' ') {
                currentStringBuilder.append(s.charAt(i));
            }
        }

        if(!currentStringBuilder.toString().isEmpty()){
            stack.push(currentStringBuilder.toString());
        }


        while (!stack.isEmpty()){
            resultantStringBuilder.append(stack.pop());
            if(!stack.isEmpty()){
                resultantStringBuilder.append(' ');
            }
        }
        return resultantStringBuilder.toString();

    }
}
