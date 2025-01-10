//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob20\TestArrayStack.java

package chap05.prob20;

import chap05.list01.Stack;

public class TestArrayStack {
  public static void main(String[] args) {
    Stack crates = new ArrayStack(4);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.pop(): " + crates.pop());
    crates.push(null);
  }
}

/*  Output:
crates.size(): 3        crates.pop(): RAISINS
java.lang.IllegalArgumentException: object is null
        void chap05.prob22.ArrayStack.push(java.lang.Object)
                ArrayStack.java:32
        void chap05.prob22.TestArrayStack.main(java.lang.String[])
                TestArrayStack.java:15
Exception in thread main
*/
