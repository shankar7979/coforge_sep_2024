//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list05\SolveMaze.java

package chap05.list05.SolveMaze;

import chap05.list01.Stack;
import chap05.list02.ArrayStack;

public class SolveMaze {
  Maze maze;
  Rat rat;
  Stack stack;

  public static void main(String[] args) {
    new SolveMaze(args[0]);
  }

  public SolveMaze(String file) {
    maze = new Maze(file);
    rat = new Rat(maze);
    stack = new ArrayStack();
    maze.print();
    while (!rat.isOut()) {
      Location currentLocation = rat.getLocation();
      // see Programming Problem 5.28 on page 161
    }
  }
}

/*  Output:
7.0 A 2.0 = 9.0
8.0 D 4.0 = 2.0
5.0 S 2.0 = 3.0
9.0 M 3.0 = 27.0
*/
