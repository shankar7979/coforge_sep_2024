//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list07\Rat.java

package chap05.list07;

import chap05.list01.Stack;
import chap05.list02.ArrayStack;

public class Rat {
  private Maze maze;
  private Location location;
  
  public Rat(Maze maze) {
    this.maze = maze;
    location = new Location(1,1);
  }

  public Location getLocation() {
    return (Location)location.clone();
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public boolean canMove(int direction) {
    Location neighbor = location.adjacent(direction);
    return maze.isOpen(neighbor);
  }

  public void move(int direction) {
    location.move(direction);
    maze.markMoved(location);
  }

  public boolean isOut() {
    // See Programming Problem 5.26 on page 161
  }
}

/*  Output:
7.0 A 2.0 = 9.0
8.0 D 4.0 = 2.0
5.0 S 2.0 = 3.0
9.0 M 3.0 = 27.0
*/
