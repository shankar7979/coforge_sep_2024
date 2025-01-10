//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob05\TestPolynomial.java

package chap08.prob05;

import chap08.list11.Term;
import chap08.prob05.Polynomial;

public class TestPolynomial {
    
    public TestPolynomial() {
        double[] c = {0.0, 5.0, 0.0, 4.0, -3.0, 0.0, 0.0, 2.0};
        Polynomial p = new Polynomial(c);
        System.out.println(p);
        System.out.println("p.valueAt(2.0): " + p.valueAt(2.0));
    }

    public static void main(String[] args) {
        new TestPolynomial();
    }
}

/*  Output:
2.0x^7 - 3.0x^4 + 4.0x^3 + 5.0x
p.valueAt(2.0): 250.0
*/
