package leetcode150.stack;

import java.util.Stack;

public class Q3MinStack {

    private static Stack<Integer> stack;
    private static Stack<Integer> minStack;
    public Q3MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val) {
            minStack.push(val);
        }
    }

    public void pop() {
        Integer pop = stack.pop();
        if(minStack.peek().equals(pop)) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

