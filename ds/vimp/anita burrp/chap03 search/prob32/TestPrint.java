//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob32\TestPrint.java

package chap03.prob32;

public class TestPrint {
    protected Object[] objects;       // backing array
    protected int size;               // actual number of Objects stored
    protected static final int CAPACITY=10;  // default array length

    public TestPrint() {
        int[][] a = { { 20, 21, 22, 23, 24 },
                      { 30, 31, 32, 33, 34 },
                      { 40, 41, 42, 43, 44 } };
        print(a);
    }

  public void print(int[][] a) {
    // Prints the two-dimensional array a[][], one row per line.
    int rows=a.length, cols=a[0].length;
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

    public static void main(String[] args) {
        new TestPrint();
    }
}

/*  Output:
20 21 22 23 24 
30 31 32 33 34 
40 41 42 43 44 
*/
