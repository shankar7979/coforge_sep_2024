//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob09\TestToLinkedStack.java

package chap05.prob09;

import chap05.list10.LinkedStack;
import chap05.prob09.ArrayStack;

public class TestToLinkedStack {
  public static void main(String[] args) {
    ArrayStack crates = new ArrayStack(4);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    LinkedStack s = crates.toLinkedStack();
    System.out.println("s.peek(): " + s.peek());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
  }
}

/*  Output:
s.peek(): BANANAS
s.pop(): BANANAS
s.pop(): PICKLES
s.pop(): RAISINS
s.pop(): ORANGES
s.pop(): CARROTS
*/
