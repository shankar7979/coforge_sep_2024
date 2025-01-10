//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list04\ObjectArray.java

package chap03.list04;

public class ObjectArray {
  public static void main(String[] args) {
    String s="Mercury";
    Float x = new Float(3.14159);
    java.util.Date d = new java.util.Date();
    int[] a = new int[] {11, 33, 55, 77, 99};
    Object[] objects = {s, x, d, a};
    print(objects);
  }

  static void print(Object[] a) {
    System.out.print("{" + a[0]);
    for (int i=1; i<a.length; i++)
      System.out.print("," + a[i]);
    System.out.println("}");
    if (a[0] instanceof String)
      System.out.println(((String)a[0]).charAt(6));
    if (a[1] instanceof Float)
      System.out.println(((Float)a[1]).isNaN());
    if (a[2] instanceof java.util.Date)
      System.out.println(((java.util.Date)a[2]).getTime());
    if (a[3] instanceof int[])
      System.out.println(((int[])a[3]).length);
  }
}

/*  Output:
{Mercury,3.14159,Tue Jul 08 09:42:19 EDT 2003,[I@2}
y
false
1057671739812
5
*/
