package leetcode150.stack;

import java.util.Stack;

public class Q2SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] splits = path.split("/");

        for (String split : splits) {
            if(split.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!split.isBlank() && !split.equals(".")) {
                stack.push(split);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stack) {
            stringBuilder.append("/").append(s);
        }

        return !stack.isEmpty() ? stringBuilder.toString(): "/";
    }

}
