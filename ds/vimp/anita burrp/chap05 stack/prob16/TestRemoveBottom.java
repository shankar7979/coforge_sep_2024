//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob16\TestRemoveBottom.java

package chap05.prob16;

import chap05.list01.Stack;
import chap05.prob04.LinkedStack;

public class TestRemoveBottom {
    
    public TestRemoveBottom() {
        Stack crates = new LinkedStack();
        crates.push("CARROTS");
        crates.push("ORANGES");
        crates.push("RAISINS");
        crates.push("PICKLES");
        crates.push("BANANAS");
        System.out.println("crates: " + crates);
        System.out.println("removeBottom(crates): " + removeBottom(crates));
        System.out.println("crates: " + crates);
    }
    
    public static void main(String[] args) {
        new TestRemoveBottom();
    }

    Object removeBottom(Stack stack) {
        int n = stack.size();
        if (n<1) throw new IllegalArgumentException("stack is empty");
        if (n<2) return stack.pop();
        Stack auxStack = new LinkedStack();
        for (int i=0; i<n-1; i++)
            auxStack.push(stack.pop());
        Object bottom = stack.pop();
        for (int i=0; i<n-1; i++)
            stack.push(auxStack.pop());
        return bottom;
    }
}

/*  Output:
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
removeBottom(crates): CARROTS
crates: (BANANAS,PICKLES,RAISINS,ORANGES)
*/