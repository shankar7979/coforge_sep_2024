//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob12\TestSequentialSearch.java

package chap03.prob12;

public class TestBinarySearch {
  public static void main(String[] args) {
    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
    int k = search(a, 50);
    System.out.println("search(a," + 50 + "): " + k);
    int i = -k-1;
    System.out.println("i: " + i);
    System.out.println("a[" + (i-1) + "]: " + a[i-1]);
    System.out.println("a[" + i + "]: " + a[i]);
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
search(a,50): -4
i: 3
a[2]: 44
a[3]: 55
*/
