import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 23:15
 * desc:
 * Implement a stack with the following methods:
 *
 * MinimumStack() constructs a new instance of a minimum stack
 * append(int val) appends val to the stack
 * peek() retrieves the last element in the stack
 * min() retrieves the minimum value in the stack
 * pop() pops and returns the last element in the stack
 * Each method should be done in \mathcal{O}(1)O(1) time. You can assume that for peek, min and pop, the stack is non-empty when they are called.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the number of calls to append, peek, min, and pop.
 * Example 1
 * Input
 * methods = ["constructor", "append", "append", "min", "peek", "pop", "pop"]
 * arguments = [[], [1], [2], [], [], [], []]`
 * Output
 * [null, null, null, 1, 2, 2, 1]
 * Explanation
 * We create a Minimumstack
 * We append 1 to the stack
 * We append 2 to the stack
 * We get the min value which is 1
 * We get the top value which is 2
 * We pop the top value which is 2
 * We pop the top value which is 1
 *
 * HINTS:
 *
 *
 Do you really need to go through all of list to get current min value?

 Can min value be decided while append or pop? Try to find min in O(1) by manipulating elements with Math

 or also you can use extra space to keep track of min element
 */

public class MinimumStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinimumStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void append(int val) {
        if(stack.isEmpty()) {
            minstack.push(val);
        }
        else if(!minstack.isEmpty() && minstack.peek() > val){
            minstack.push(val);
        }
        stack.push(val);
    }
    public int peek() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }

    public int pop() {
        int num = stack.pop();
        if(num == minstack.peek()){
            minstack.pop();
        }
        return num;
    }
}
