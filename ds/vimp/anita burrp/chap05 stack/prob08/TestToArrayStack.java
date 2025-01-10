//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob08\TestToArrayStack.java

package chap05.prob08;

import chap05.list02.ArrayStack;
import chap05.prob08.LinkedStack;

public class TestToArrayStack {
  public static void main(String[] args) {
    LinkedStack crates = new LinkedStack();
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    ArrayStack s = crates.toArrayStack();
    System.out.println("s.peek(): " + s.peek());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
    System.out.println("s.pop(): " + s.pop());
  }
}

/*  Output
s.peek(): BANANAS
s.pop(): BANANAS
s.pop(): PICKLES
s.pop(): RAISINS
s.pop(): ORANGES
s.pop(): CARROTS
*/
