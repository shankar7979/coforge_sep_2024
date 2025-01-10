//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list05\SolveMaze.java

package chap05.list05;

import chap05.list01.Stack;
import chap05.list02.ArrayStack;
import chap05.list06.Maze;
import chap05.list07.Rat;
import chap05.list08.Location;
import chap05.list09.Direction;

public class SolveMaze {
  Maze maze;
  Rat rat;
  Stack stack;

  public SolveMaze(String file) {
    maze = new Maze("B:\\Maze.txt");
//    maze = new Maze(file);
    rat = new Rat(maze);
    stack = new ArrayStack(100);
    maze.print();
    while (!rat.isOut()) {
      Location currentLocation = rat.getLocation();
      
      // Programming Problem 5.23 on page 173:
      for (int direction=0; direction<4; direction++) {
        if (rat.canMove(direction)) {
          stack.push(currentLocation);
          rat.move(direction);
          break;
        } else if (stack.size() == 0) {
          System.out.println("NO SOLUTION.");
          System.exit(0);
        } else {  // backtrack
          maze.markTried(currentLocation);
          Location lastLocation = (Location)stack.pop();
          rat.setLocation(lastLocation);
        }
      }

    }
  }

  public static void main(String[] args) {
    new SolveMaze(args[0]);
  }
}

/*  Output:
7.0 A 2.0 = 9.0
8.0 D 4.0 = 2.0
5.0 S 2.0 = 3.0
9.0 M 3.0 = 27.0
*/
