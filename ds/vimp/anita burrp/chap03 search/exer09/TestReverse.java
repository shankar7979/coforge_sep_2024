//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\exer09\TestReverse.java

package chap03.exer09;

import chap03.list08.IntArrays;

public class TestReverse {
    
    public TestReverse() {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        IntArrays.print(a);
        reverse(a);
        IntArrays.print(a);
    }

    public static void reverse(int[] a) {
        int n = a.length;
//        for (int i=0; i<n; i++)
        for (int i=0; i<n/2; i++)
            IntArrays.swap(a, i, n-1-i);
    }

    public static void main(String[] args) {
        new TestReverse();
    }
}

/* Output:
{22,33,44,55,66,77,88,99}
{99,88,77,66,55,44,33,22}
*/
