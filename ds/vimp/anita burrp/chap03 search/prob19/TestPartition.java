//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob19\TestPartition.java

package chap03.prob19;

import chap03.list08.IntArrays;

public class TestPartition {
    
    public TestPartition() {
        int[] a = IntArrays.randomInts(8, 100);
        IntArrays.print(a);
        System.out.println("partition(a): " + partition(a));
        IntArrays.print(a);
    }

  int partition(int[] a) {
    int a0 = a[0], i = 0, j = a.length;
    while (i < j) {
      while (i < j && a[--j] >= a0)
        ;
      if (i < j) a[i] = a[j];
      while (i < j && a[++i] <= a0)
        ;
      if (i < j) a[j] = a[i];
    }
    a[j] = a0;
    return j;
  }

    public static void main(String[] args) {
        new TestPartition();
    }
}

/*  Output:
{45,11,97,26,87,62,30,39}
partition(a): 4
{39,11,30,26,45,62,87,97}
*/
