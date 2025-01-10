//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list09\Direction.java

package chap05.list09;

public class Direction {
  public static final int NORTH = 0, EAST = 1, SOUTH = 2, WEST = 3;
  private int direction;

  public Direction(int d) {
    if (d < 0 || d > 3) throw new IllegalArgumentException();
    direction = d;
  }

  public int getDirection() {
    return direction;
  }
}
