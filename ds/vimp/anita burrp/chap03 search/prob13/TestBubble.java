//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob13\TestBubble.java

package chap03.prob13;

import chap03.list08.IntArrays;

public class TestBubble {
    
    public TestBubble() {
        int[] a = IntArrays.randomInts(8, 100);
        IntArrays.print(a);
        bubble(a);
        IntArrays.print(a);
    }

  void bubble(int[] a) {
    for (int i=1; i<a.length; i++)
      if (a[i] < a[i-1]) IntArrays.swap(a, i-1, i);
  }

    public static void main(String[] args) {
        new TestBubble();
    }
}

/*  Output:
{34,22,30,29,86,31,43,31}
{22,30,29,34,31,43,31,86}
*/
