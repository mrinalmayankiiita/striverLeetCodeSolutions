package leetcode150.stack;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Q4ReversePolishNotation {

    private final static Set<String> bodmasExpressions = Set.of("+","-","/","*");
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if(!bodmasExpressions.contains(token)){
                stack.push(token);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int c;

                if(token.equals("+")){
                    c= b+a;
                } else if (token.equals("-")){
                    c= b-a;
                } else if (token.equals("*")){
                    c= b*a;
                } else {
                    c= b/a;
                }

                stack.push(Integer.toString(c));
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
