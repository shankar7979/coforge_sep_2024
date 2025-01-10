//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob11\TestPopSecond.java

package chap05.prob11;

public class TestPopSecond {
  public static void main(String[] args) {
    LinkedStack crates = new LinkedStack();
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates: " + crates);
    System.out.println("crates.popSecond(): " + crates.popSecond());
    System.out.println("crates: " + crates);
  }
}

/*  Output
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
crates.popSecond(): PICKLES
crates: (BANANAS,RAISINS,ORANGES,CARROTS)
*/
