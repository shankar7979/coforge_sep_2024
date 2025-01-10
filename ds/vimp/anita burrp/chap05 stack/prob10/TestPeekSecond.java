//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob10\TestPeekSecond.java

package chap05.prob10;

public class TestPeekSecond {
  public static void main(String[] args) {
    LinkedStack crates = new LinkedStack();
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates: " + crates);
    System.out.println("crates.peekSecond(): " + crates.peekSecond());
  }
}

/*  Output
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
crates.peekSecond(): PICKLES
*/
