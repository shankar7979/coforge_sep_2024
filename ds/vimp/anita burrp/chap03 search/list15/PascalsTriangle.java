//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list15\PascalsTriangle.java

package chap03.list15;

public class PascalsTriangle {
  public static void main(String[] args) {
    int rows = Integer.parseInt(args[0]);
    int[][] a = init(rows);
    print(a);
  }

  static int[][] init(int n) {
    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j <= i; j++)
        if (j == 0 || j == i) a[i][j] = 1;
        else a[i][j] = a[i-1][j-1] + a[i-1][j];
 	  return a;
  }

  static void print(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j <= i; j++)
        print(a[i][j],5);
      System.out.println();
    }
  }

  static void print(int n, int w) {
    // prints n right-justified in a field on width w: 
    String s = "" + n, blanks = "                    ";
    int len = s.length();
    System.out.print(blanks.substring(0, w-len) + s);
  }
}

/*  Output:
    1
    1    1
    1    2    1
    1    3    3    1
    1    4    6    4    1
    1    5   10   10    5    1
    1    6   15   20   15    6    1
*/
