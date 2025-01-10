//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob15\TestInsert.java

package chap03.prob15;

import chap03.list08.IntArrays;

public class TestInsert {
    
    public TestInsert() {
        int[] a = {22, 33, 44, 66, 77, 88, 99, 55};
        IntArrays.print(a);
        insert(a);
        IntArrays.print(a);
    }

  void insert(int[] a) {
    int i = a.length - 1;
    int ai = a[i], j = i;
    for (j=i; j>0 && a[j-1]>ai; j--)
      a[j] =a[j-1];
    a[j] = ai;
  }

    public static void main(String[] args) {
        new TestInsert();
    }
}

/*  Output:
{22,33,44,66,77,88,99,55}
{22,33,44,55,66,77,88,99}
*/
