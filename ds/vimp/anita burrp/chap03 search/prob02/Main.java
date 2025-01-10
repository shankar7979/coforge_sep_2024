//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob02\Main.java

package chap03.prob02;

public class Main {
  boolean[] z = new boolean[8];
  char[] c = new char[8];
  byte[] b = new byte[8];
  short[] s = new short[8];
  long[] j = new long[8];
  float[] f = new float[8];
  double[] d = new double[8];
  Object[] x = new Object[8];

  public Main() {
    int[] a = { 33,44,55,66};
    try {a[8]=0;} catch(Exception e){}
    System.out.println("z:\t" + z);
    System.out.println("c:\t" + c);
    System.out.println("b:\t" + b);
    System.out.println("s:\t" + s);
    System.out.println("j:\t" + j);
    System.out.println("f:\t" + f);
    System.out.println("d:\t" + d);
    System.out.println("x:\t" + x);
  }

  public static void main(String[] args) {
    new Main();
  }
}

/* Output:
z:      [Z@a16869
c:      [C@cde100
b:      [B@6f0472
s:      [S@8d107f
j:      [J@360be0
f:      [F@45a877
d:      [D@372a1a
x:      [Ljava.lang.Object;@ad3ba4
*/