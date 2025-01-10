//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list01\TestInsert.java

package chap04.prob01;

import chap03.list08.IntArrays;

public class TestInsert {
    public TestInsert() {
        int[] a = {33,55,66,88,0,0,0,0};
        IntArrays.print(a);
        insert(a,4,50);
        IntArrays.print(a);
        insert(a,5,90);
        IntArrays.print(a);
        insert(a,6,20);
        IntArrays.print(a);
    }

    void insert(int[] a, int n, int x) {
        // preconditions: [0] <= ... <= a[n-1], and n < a.length;
        // postconditions: a[0] <= ... <= a[n], and x is among them;
        int i = 0;  // find the first index i for which a[i] > x:
        while (i < n && a[i] <= x)
              ++i;
        // shift {a[i],...,a[n-1]} into {a[i+1],...,a[n]}:
        System.arraycopy(a, i, a, i+1, n-i);
        // insert x into a[i]:
        a[i] = x;
    }
    
    public static void main(String[] args) {
        new TestInsert();
    }
}

/*  Output:
{33,55,66,88,0,0,0,0}
{33,50,55,66,88,0,0,0}
{33,50,55,66,88,90,0,0}
{20,33,50,55,66,88,90,0}
*/
