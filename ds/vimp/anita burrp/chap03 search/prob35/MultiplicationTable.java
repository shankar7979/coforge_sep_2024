//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob35\prob35.java

package chap03.prob35;

public class MultiplicationTable {
  public static void main(String[] args) {
    int rows = Integer.parseInt(args[0]);
    int[][] a = init(rows);
    print(a);
  }

  static int[][] init(int n) {
    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        a[i][j] = (i+1)*(j+1);
    return a;
  }

  static void print(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++)
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
    1    2    3    4    5    6    7
    2    4    6    8   10   12   14
    3    6    9   12   15   18   21
    4    8   12   16   20   24   28
    5   10   15   20   25   30   35
    6   12   18   24   30   36   42
    7   14   21   28   35   42   49
*/
