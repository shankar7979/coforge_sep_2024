//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob16\TestFrequency.java

package chap03.prob16;

import chap03.list08.IntArrays;

public class TestFrequency {
    
    public TestFrequency() {
        int[] a = {1, 4, 5, 4, 9, 2, 4, 3, 1, 1, 6, 1, 3, 5, 3,
                   2, 4, 2, 9, 2, 1, 1, 4, 8, 4, 3, 2, 1, 1};
        IntArrays.print(a);
        System.out.println("frequency(a,1): " + frequency(a,1));
        System.out.println("frequency(a,2): " + frequency(a,2));
    }

  int frequency(int[] a, int value) {
    int f = 0;
    for (int i=0; i<a.length; i++)
      if (a[i] == value) ++f;
    return f;
  }

    public static void main(String[] args) {
        new TestFrequency();
    }
}

/*  Output:
{1,4,5,4,9,2,4,3,1,1,6,1,3,5,3,2,4,2,9,2,1,1,4,8,4,3,2,1,1}
frequency(a,1): 8
frequency(a,2): 5
*/
