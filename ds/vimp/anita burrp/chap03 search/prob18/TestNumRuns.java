//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob16\TestNumRuns.java

package chap03.prob18;

import chap03.list08.IntArrays;

public class TestNumRuns {
    
    public TestNumRuns() {
        int[] a = {1, 4, 4, 4, 2, 2, 4, 3, 1, 1, 1, 1, 3, 3, 
                   3, 2, 4, 2, 2, 2, 1, 1, 4, 4, 4, 3, 2, 1, 1};
        IntArrays.print(a);
        System.out.println("numRuns(a,2): " + numRuns(a,2));
        System.out.println("numRuns(a,3): " + numRuns(a,3));
        System.out.println("numRuns(a,4): " + numRuns(a,4));
    }

  int numRuns(int[] a, int length) {
    int num = 0;
    int value = a[0], lengthThisRun = 1;
    for (int i=1; i<a.length; i++) {
      if (a[i] == value) ++lengthThisRun;
      else {
        value = a[i];
        if (lengthThisRun == length) ++num;
        lengthThisRun = 1;
      }
    }
    return num;
  }

    public static void main(String[] args) {
        new TestNumRuns();
    }
}

/*  Output:
{1,4,4,4,2,2,4,3,1,1,1,1,3,3,3,2,4,2,2,2,1,1,4,4,4,3,2,1,1}
numRuns(a,2): 2
numRuns(a,3): 4
numRuns(a,4): 1
*/
