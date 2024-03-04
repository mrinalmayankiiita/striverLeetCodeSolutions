package leetcode150.stack;

import java.util.Stack;

public class Q1ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();

        for (char c : s.toCharArray()) {
            if(!characters.isEmpty()) {
                Character character = characters.peek();
                if ((c == ')' && character == '(') ||
                        (c == '}' && character == '{') ||
                        (c == ']' && character == '[')) {
                    characters.pop();
                } else {
                    characters.push(c);
                }
            } else {
                characters.push(c);
            }
        }

        return characters.isEmpty();
    }
}
