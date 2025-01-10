//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list07\TestJavaUtilArrays.java

package chap03.list07;

public class TestJavaUtilArrays {
    
  public static void main(String[] args) {
    int[] a = {77, 44, 55, 22, 99, 66, 33, 88}; 
    print(a);
    java.util.Arrays.sort(a);
    print(a);
    test(a,55);
    test(a,60);
    test(a,88);
    test(a,90);
  }
  static void test(int[] array, int target) {
    int i = java.util.Arrays.binarySearch(array,target);
    System.out.print("target="+target+", i="+i);
    if (i >= 0) System.out.println("\ta[" + i + "]=" + array[i]);
    else System.out.println("\tInsert " + target+" at a["+(-i-1)+"]");
  }

  static void print(int[] a) {
        System.out.print("{"+a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
        System.out.println("}");
  }
}

/*  Output:
{77,44,55,22,99,66,33,88}
{22,33,44,55,66,77,88,99}
target=55, i=3  a[3]=55
target=60, i=-5 Insert 60 at a[4]
target=88, i=6  a[6]=88
target=90, i=-8 Insert 90 at a[7]
*/
