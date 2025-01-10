//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob03\TestToString.java

package chap05.prob03;

public class TestToString {
  public static void main(String[] args) {
    ArrayStack crates = new ArrayStack(4);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates: " + crates);
  }
}

/*  Output:
crates: (BANANAS,PICKLES,RAISINS,ORANGES,CARROTS)
*/
