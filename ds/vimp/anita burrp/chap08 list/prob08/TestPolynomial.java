//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob08\TestPolynomial.java

package chap08.prob08;

import chap08.prob06.Polynomial;

public class TestPolynomial {
    
    public TestPolynomial() {
        Polynomial p = new Polynomial(-3.0, 4);
        p = p.plus(new Polynomial(4.0, 3));
        p = p.plus(new Polynomial(5.0, 1));
        System.out.println("p(x) = " + p);
        System.out.println("p(2) = " + p.valueAt(2.0));
        System.out.println("p(-1) = " + p.valueAt(-1.0));
    }

    public static void main(String[] args) {
        new TestPolynomial();
    }
}

/*  Output:
p(x) = -3.0x^4 + 4.0x^3 + 5.0x
p(2) = -6.0
p(-1) = -12.0
*/
