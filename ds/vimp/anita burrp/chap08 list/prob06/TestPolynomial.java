//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob06\TestPolynomial.java

package chap08.prob06;

import chap08.prob06.Polynomial;

public class TestPolynomial {
    
    public TestPolynomial() {
        Polynomial p = new Polynomial(-3.0, 4);
        p = p.plus(new Polynomial(4.0, 3));
        p = p.plus(new Polynomial(5.0, 1));
        System.out.println(p);
        double[] a = p.toArray();
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestPolynomial();
    }
}

/*  Output:
-3.0x^4 + 4.0x^3 + 5.0x
0.0 5.0 0.0 4.0 -3.0 
*/
