//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob13\TestPopBottom.java

package chap05.prob13;

public class TestPopBottom {
  public static void main(String[] args) {
    ArrayStack crates = new ArrayStack(100);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates: " + crates);
    System.out.println("crates.popBottom(): " + crates.popBottom());
    System.out.println("crates: " + crates);
  }
}

/*  Output
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
crates.popBottom(): CARROTS
crates: (BANANAS,PICKLES,RAISINS,ORANGES)
*/
