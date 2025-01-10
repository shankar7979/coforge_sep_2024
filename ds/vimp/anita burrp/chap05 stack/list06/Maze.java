//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list06\Maze.java

package chap05.list06;

import java.io.*;

public class Maze {
  private int m, n;
  private int[][] a;
  private static final int OPEN = 0, WALL = 1,  TRIED = 2, PATH = 3;

  public Maze(String file) {
    // see Programming Problem 5.25 on page 161
  }

  public boolean isOpen(Location location) {
    return (a[location.getY()][location.getX()] == OPEN);
  }

  public void markMoved(Location location) {
    a[location.getY()][location.getX()] = PATH;
  }

  public void markTried(Location location) {
    a[location.getY()][location.getX()] = TRIED;
  }

  public int getWidth() {
    return n;
  }

  public int getHeight() {
    return m;
  }

  public void print() {
    char[] chars = {' ', '+', '?', 'o'};
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        System.out.print( chars[ a[i][j] ] );
      System.out.println();
    }
  }
}

/*  Output:
7.0 A 2.0 = 9.0
8.0 D 4.0 = 2.0
5.0 S 2.0 = 3.0
9.0 M 3.0 = 27.0
*/
