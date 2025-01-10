package chap05.prog17;

import chap05.list01.Stack;
import chap05.list10.LinkedStack;

public class Main {
    
    public Main() {
        Stack stack = new LinkedStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(bottom(stack));
    }

    public Object bottom(Stack stack) {
        if (stack.size()==0) throw new IllegalArgumentException();
        Stack temp = new LinkedStack();
        while (stack.size()>0)
            temp.push(stack.pop());
        Object bottom = temp.peek();
        while (temp.size()>0)
            stack.push(temp.pop());
        return bottom;
    }

    public static void main(String[] args) {
        new Main();
    }
}
