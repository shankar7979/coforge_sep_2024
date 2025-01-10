//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob14\TestSelect.java

package chap03.prob14;

import chap03.list08.IntArrays;

public class TestSelect {
    
    public TestSelect() {
        int[] a = IntArrays.randomInts(8, 100);
        IntArrays.print(a);
        select(a);
        IntArrays.print(a);
    }

  void select(int[] a) {
    int m=0;
    for (int i=1; i<a.length; i++)
      if (a[i] > a[m]) m = i;
    IntArrays.swap(a, m, a.length-1);
  }

    public static void main(String[] args) {
        new TestSelect();
    }
}

/*  Output:
{37,15,81,17,20,46,56,60}
{37,15,60,17,20,46,56,81}
*/
