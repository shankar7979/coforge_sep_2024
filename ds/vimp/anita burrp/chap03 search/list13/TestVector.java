//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list13\TestVector.java

package chap03.list13;

import chap03.list12.Vector;

public class TestVector {
  public static void main(String[] args) {
    Vector v = new Vector(args);
    System.out.println(v);
  }
}

/*  Output:
(alpha,beta,gamma,delta,epsilon)
*/
