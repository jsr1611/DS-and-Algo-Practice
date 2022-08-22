import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/14 02:52
 * desc: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */

public class MinStack155 {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack155() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()) {
            minstack.push(val);
        }
        else{
            if(minstack.peek() > val){
                minstack.push(val);
            }
            else{
                minstack.push(minstack.peek());
            }
        }
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
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