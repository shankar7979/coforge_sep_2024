//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob07\TestToArray.java

package chap05.prob07;

public class TestToArray {
  public static void main(String[] args) {
    LinkedStack crates = new LinkedStack();
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    Object[] a = crates.toArray();
    for (int i=0; i<a.length; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}

/*  Output
BANANAS PICKLES RAISINS ORANGES CARROTS 
*/
