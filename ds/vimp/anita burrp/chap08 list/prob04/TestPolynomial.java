//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob04\TestPolynomial.java

package chap08.prob04;

import chap08.list11.Term;
import chap08.list12.Polynomial;

public class TestPolynomial {
  public TestPolynomial() {
    Polynomial p1 = new Polynomial(2.0, 3);
    System.out.println(p1);
    System.out.println("p1.degree(): " + p1.degree());
    Polynomial p2 = new Polynomial(p1);
    System.out.println("p2.equals(p1): " + p2.equals(p1));
    p2 = p1.plus(p2);
    System.out.println(p2);
    System.out.println("p2.equals(p1): " + p2.equals(p1));
    p1 = p1.plus(new Term(-9.0, 2));
    System.out.println(p1);
    System.out.println("p1.degree(): " + p1.degree());
    p1 = p1.plus(new Term(5.0, 8));
    System.out.println(p1);
    System.out.println("p1.degree(): " + p1.degree());
    p1 = p1.plus(p2);
    System.out.println(p1);
    System.out.println("p1.degree(): " + p1.degree());
    Polynomial p3 = p1.times(-2.0);
    System.out.println("p3: " + p3);
    System.out.println("p3.degree(): " + p3.degree());
    p1 = p1.times(new Polynomial(-5.0, 3));
    System.out.println(p1);
    System.out.println("p1.degree(): " + p1.degree());
    System.out.println("p1.valueAt(1.0): " + p1.valueAt(1.0));
    System.out.println("p1.valueAt(-1.0): " + p1.valueAt(-1.0));
    System.out.println("p1.valueAt(2.0): " + p1.valueAt(2.0));
    p1 = p1.times(new Polynomial(5.0, -3));
  }

  public static void main(String[] args) {
    new TestPolynomial();
  }
}

/*  Output:
2.0x^3
p1.degree(): 3
p2.equals(p1): true
4.0x^3
p2.equals(p1): false
2.0x^3 - 9.0x^2
p1.degree(): 3
5.0x^8 + 2.0x^3 - 9.0x^2
p1.degree(): 8
5.0x^8 + 6.0x^3 - 9.0x^2
p1.degree(): 8
p3: -10.0x^8 - 12.0x^3 + 18.0x^2
p3.degree(): 8
-25.0x^11 - 30.0x^6 + 45.0x^5
p1.degree(): 11
p1.valueAt(1.0): -10.0
p1.valueAt(-1.0): -50.0
p1.valueAt(2.0): -51680.0
java.lang.IllegalArgumentException
        void chap08.list11.Term.<init>(double, int)
                Term.java:20
        void chap08.list12.Polynomial.<init>(double, int)
                Polynomial.java:26
        void chap08.prob04.TestPolynomial.<init>()
                TestPolynomial.java:37
        void chap08.prob04.TestPolynomial.main(java.lang.String[])
                TestPolynomial.java:41
Exception in thread main
*/
