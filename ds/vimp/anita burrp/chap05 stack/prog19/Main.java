package chap05.prog19;

import chap05.list01.Stack;
import chap05.list10.LinkedStack;

public class Main {
    
    public Main() {
        Stack stack = new LinkedStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        Stack reversedStack = reversed(stack);
        while (reversedStack.size()>0)
            System.out.println(reversedStack.pop());    
    }

    public Stack reversed(Stack stack) {
        Stack reversed = new LinkedStack();
        Stack temp = new LinkedStack();
        while (stack.size()>0) {
            reversed.push(stack.peek());
            temp.push(stack.pop());
        }
        while (temp.size()>0)
            stack.push(temp.pop());
        return reversed;
    }

    public static void main(String[] args) {
        new Main();
    }
}

