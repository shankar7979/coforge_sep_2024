//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob15\TestRemoveSecondFromTop.java

package chap05.prob15;

import chap05.list01.Stack;
import chap05.prob04.LinkedStack;

public class TestRemoveSecondFromTop {
    
    public TestRemoveSecondFromTop() {
        Stack s = new LinkedStack();
        s.push("CARROTS");
        s.push("ORANGES");
        s.push("RAISINS");
        s.push("PICKLES");
        s.push("BANANAS");
        System.out.println("s: " + s);
        System.out.println("removeSecondFromTop(s): " + removeSecondFromTop(s));
        System.out.println("s: " + s);
    }
    
    public static void main(String[] args) {
        new TestRemoveSecondFromTop();
    }

    Object removeSecondFromTop(Stack stack) {
        int n = stack.size();
        if (n<2) throw new IllegalArgumentException("stack is empty");
        Object top1 = stack.pop();
        Object top2 = stack.pop();
        stack.push(top1);
        return top2;
    }
}

/*  Output:
s: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
removeSecondFromTop(s): PICKLES
s: (BANANAS,RAISINS,ORANGES,CARROTS)
*/