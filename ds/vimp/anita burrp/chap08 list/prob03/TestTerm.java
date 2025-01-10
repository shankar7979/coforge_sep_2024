//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob03\TestTerm.java

package chap08.prob03;

import chap08.list11.Term;

public class TestTerm {
  public TestTerm() {
    Term t1 = new Term(7.0, 4);
    System.out.println(t1);
    System.out.println("t1.getCoef(): " + t1.getCoef());
    System.out.println("t1.getExp(): " + t1.getExp());
    Term t2 = new Term(t1);
    System.out.println(t2);
    System.out.println("t2.equals(t1): " + t2.equals(t1));
    Term t3 = t1.times(-2.0);
    System.out.println(t3);
    System.out.println("t3.equals(t1): " + t3.equals(t1));
    System.out.println(t3.abs());
    System.out.println("t1.plus(t3): " + t1.plus(t3));
    System.out.println("t3.plus(t1).plus(t1): " + t3.plus(t1).plus(t1));
    System.out.println("t1.times(t3): " + t1.times(t3));
  }

  public static void main(String[] args) {
    new TestTerm();
  }
}

/*  Output:
7.0x^4
t1.getCoef(): 7.0
t1.getExp(): 4
7.0x^4
t2.equals(t1): true
-14.0x^4
t3.equals(t1): false
14.0x^4
t1.plus(t3): -7.0x^4
t3.plus(t1).plus(t1): 0
t1.times(t3): -98.0x^8
*/
