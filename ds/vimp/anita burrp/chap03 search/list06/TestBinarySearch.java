//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list06\TestBinarySearch.java

package chap03.list06;

public class TestBinarySearch {
    
  public static void main(String[] args) {
    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
    System.out.println("search(a," + 55 + "): " + search(a, 55));
    System.out.println("search(a," + 50 + "): " + search(a, 50));
  }

  static int search(int[] a, int x) {
    int p = 0, q = a.length-1;
    while (p <= q) {           // search the segment a[p..q]
      int i = (p+q)/2;         // index of element in the middle
      if (a[i] == x) return i;
      if (a[i] < x) p = i+1;   // search upper half
      else q = i-1;            // search lower half 
    }
    return -p-1;               // not found 
  }
}

/*  Output:
search(a,55): 3
search(a,50): -4
*/
