import java.util.Stack;
//push - add
//poll - remove  and return
//peek - return
public class Queue  {
    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> reversed = new Stack<>();


    public boolean push(Integer i) {
        if (stack.empty()) reversedToStack();
        stack.push(i);
        return true;
    }
    public Integer poll() {
        if (reversed.empty())stackToReversed();
        return reversed.pop();

    }
    public Integer peek() {
        if (reversed.empty())stackToReversed();
        return reversed.peek();
    }

    private static Stack<Integer> stackToReversed(){
        while (!stack.empty()) reversed.push(stack.pop());
        return reversed;
    }

    private static Stack<Integer> reversedToStack(){
        while (!reversed.empty()) stack.push(reversed.pop());
        return stack;
    }
}
