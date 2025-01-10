//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list05\TestSequentialSearch.java

package chap03.list05;

public class TestSequentialSearch {

  public static void main(String[] args) {
    int[] a = {66,44,99,33,55,22,88,77};
    print(a);
    System.out.println("search(a," + 55 + "): " + search(a,55));
    System.out.println("search(a," + 50 + "): " + search(a,50));
  }

    public static void print(int[] a) {
        System.out.print("{"+a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
        System.out.println("}");
    }

   static int search(int[] a, int target) {
    for (int i=0; i<a.length; i++)
      if (a[i]==target) return i;
    return -a.length;
  }
}

/* Output:
{66,44,99,33,55,22,88,77}
search(a,55): 4
search(a,50): -8
*/
