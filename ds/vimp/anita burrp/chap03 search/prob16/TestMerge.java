//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob16\TestMerge.java

package chap03.prob16;

import chap03.list08.IntArrays;

public class TestMerge {
    
    public TestMerge() {
        int[] a = {44, 55, 77, 99, 22, 33, 66, 88};
        IntArrays.print(a);
        merge(a);
        IntArrays.print(a);
    }

  void merge(int[] a) {
    int n=a.length, m=n/2;
    int i=0, j=m, k=0;
    int[] aa = new int[n];
    while (i < m && j < n)
      if (a[i] < a[j]) aa[k++] = a[i++];
      else aa[k++] = a[j++];
    if (i < m) System.arraycopy(a, i, a, k, m-i);
    System.arraycopy(aa, 0, a, 0, k);
  }

    public static void main(String[] args) {
        new TestMerge();
    }
}

/*  Output:
{44,55,77,99,22,33,66,88}
{22,33,44,55,66,77,88,99}
*/
