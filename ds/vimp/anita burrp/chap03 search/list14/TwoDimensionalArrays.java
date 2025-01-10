//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list14\TwoDimensionalArrays.java

package chap03.list14;

import chap03.list08.IntArrays;

public class TwoDimensionalArrays {
  public static void main(String[] args) {
    int[][] a = new int[3][];        // an array of 3 sub-arrays (rows)
    a[0] = new int[]{22,44,66,88};   // the first row
    a[2] = new int[]{33,77};         // the third row
    System.out.println("a: " + a + "\na.length: " + a.length);
    IntArrays.print(a[0]);
    IntArrays.print(a[2]);
    System.out.println("a[2].length: " + a[2].length);
    int [][] b = { { 22,44,66,88 },    // the first row of b
                   {  0, 0, 0, 0 },    // the second row of b
                   { 33,55,77, 0 } };  // the third row of b
    System.out.println("b: " + b + "\nb.length: " + b.length);
    IntArrays.print(b[0]);
    IntArrays.print(b[2]);
    System.out.println("b[2].length: " + b[2].length);
  }
}

/*  Output:
a: [[I@1
a.length: 3
{22,44,66,88}
{33,77}
a[2].length: 2
b: [[I@2
b.length: 3
{22,44,66,88}
{33,55,77,0}
b[2].length: 4
*/
