//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob17\TestReverse.java

package chap05.prob17;

import chap05.list01.Stack;
import chap05.prob04.LinkedStack;

public class TestReverse {
    
    public TestReverse() {
        Stack crates = new LinkedStack();
        crates.push("CARROTS");
        crates.push("ORANGES");
        crates.push("RAISINS");
        crates.push("PICKLES");
        crates.push("BANANAS");
        System.out.println("crates: " + crates);
        reverse(crates);
        System.out.println("crates: " + crates);
    }
    
    public static void main(String[] args) {
        new TestReverse();
    }

    void reverse(Stack stack) {
        if (stack.size() < 2) return;
        Stack stack1 = new LinkedStack();
        Stack stack2 = new LinkedStack();
        while (stack.size() > 0)
            stack1.push(stack.pop());
        while (stack1.size() > 0)
            stack2.push(stack1.pop());
        while (stack2.size() > 0)
            stack.push(stack2.pop());
    }
}

/*  Output:
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
crates: (CARROTS,ORANGES,RAISINS,PICKLES,BANANAS)
*/