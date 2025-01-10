//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob18\TestReversed.java

package chap05.prob18;

import chap05.list01.Stack;
import chap05.prob04.LinkedStack;

public class TestReversed {
    
    public TestReversed() {
        Stack crates = new LinkedStack();
        crates.push("CARROTS");
        crates.push("ORANGES");
        crates.push("RAISINS");
        crates.push("PICKLES");
        crates.push("BANANAS");
        System.out.println("crates: " + crates);
        Stack upsideDown = reversed(crates);
        System.out.println("upsideDown: " + upsideDown);
        System.out.println("crates: " + crates);
    }
    
    public static void main(String[] args) {
        new TestReversed();
    }

    Stack reversed(Stack stack) {
        Stack stack1 = new LinkedStack();
        Stack stack2 = new LinkedStack();
        while (stack.size() > 0) {
            stack1.push(stack.peek());
            stack2.push(stack.pop());
        }
        while (stack2.size() > 0)
            stack.push(stack2.pop());
        return stack1;
    }
}

/*  Output:
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
upsideDown: (CARROTS,ORANGES,RAISINS,PICKLES,BANANAS)
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
*/