//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob14\TestReverse.java

package chap05.prob14;

public class TestReverse {
  public static void main(String[] args) {
    LinkedStack crates = new LinkedStack();
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates: " + crates);
    crates.reverse();
    System.out.println("crates: " + crates);
  }
}

/*  Output
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
crates: (CARROTS,ORANGES,RAISINS,PICKLES,BANANAS)
*/
