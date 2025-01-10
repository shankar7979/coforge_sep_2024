//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob06\TestArrays.java

package chap03.prob06;

import chap03.list08.IntArrays;

public class TestArrays {
  public static void main(String[] args) {
    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
    IntArrays.print(a);
    System.out.println("IntArrays.isSorted(a): " + IntArrays.isSorted(a));
    a = IntArrays.randomInts(8, 100);
    IntArrays.print(a);
    System.out.println("IntArrays.isSorted(a): " + IntArrays.isSorted(a));
    a = IntArrays.resize(a, 12);
    IntArrays.print(a);
    IntArrays.swap(a, 2, 6);
    IntArrays.print(a);
  }
}

/* Output:
{22,33,44,55,66,77,88,99}
IntArrays.isSorted(a): true
{50,56,13,51,38,88,54,44}
IntArrays.isSorted(a): false
{50,56,13,51,38,88,54,44,0,0,0,0}
{50,56,54,51,38,88,13,44,0,0,0,0}
*/
