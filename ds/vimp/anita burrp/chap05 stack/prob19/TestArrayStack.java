//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob19\TestArrayStack.java

package chap05.prob19;

import chap05.list01.Stack;

public class TestArrayStack {
  public static void main(String[] args) {
    Stack crates = new ArrayStack(4);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.pop(): " + crates.pop());
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.pop(): " + crates.pop());
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.pop(): " + crates.pop());
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.pop(): " + crates.pop());
    System.out.println("crates.size(): " + crates.size());
  }
}

/*  Output
crates.size(): 3        crates.pop(): RAISINS
crates.size(): 3        crates.pop(): RAISINS
crates.size(): 2        crates.pop(): ORANGES
crates.size(): 1        crates.pop(): CARROTS
crates.size(): 0
*/
