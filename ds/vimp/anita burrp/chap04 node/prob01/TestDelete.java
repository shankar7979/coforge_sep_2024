//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob01\TestDelete.java

package chap04.prob01;

import chap03.list08.IntArrays;

public class TestDelete {
  public TestDelete() {
    int[] a = {22,33,44,55,66,77,88,99};
    IntArrays.print(a);
    delete(a,8,55);
    IntArrays.print(a);
    delete(a,7,99);
    IntArrays.print(a);
    delete(a,6,22);
    IntArrays.print(a);
  }

  void delete(int[] a, int n, int x) {
    // preconditions: [0] <= ... <= a[n-1], and n <= a.length;
    // postconditions: a[0] <= ... <= a[n-2], and x is deleted;
    int i = 0;  // find the first index i for which a[i] > x:
    while (i < n && a[i] <= x)
      ++i;
    // shift {a[i],...,a[n-1]} into {a[i-1],...,a[n-2]}:
    if (i<n-1) System.arraycopy(a, i, a, i-1, n-i);
    a[n-1] = 0;
  }

  public static void main(String[] args) {
    new TestDelete();
  }
}

/*  Output:
{22,33,44,55,66,77,88,99}
{22,33,44,66,77,88,99,0}
{22,33,44,66,77,88,0,0}
{33,44,66,77,88,0,0,0}
*/
