//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob07\TestPolynomial.java

package chap08.prob07;

import chap08.prob07.Polynomial;

public class TestPolynomial {
    
    public TestPolynomial() {
        Polynomial p = new Polynomial(9.0, 0);
        p = p.plus(new Polynomial(-5.0, 1));
        p = p.plus(new Polynomial(2.0, 3));
        p = p.plus(new Polynomial(7.0, 4));
        System.out.println(p);
        System.out.println(p.derivative());
    }

    public static void main(String[] args) {
        new TestPolynomial();
    }
}

/*  Output:
7.0x^4 + 2.0x^3 - 5.0x + 9.0
28.0x^3 + 6.0x^2 - 5.0
*/
