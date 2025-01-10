//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\list08\Location.java

package chap05.list08;

public class Location implements Cloneable {
  private int x, y;

  public Location(int x, int y)  // See Programming Problem 5.27

  public Object clone()  // See Programming Problem 5.27 on page 161

  public int getX()  // See Programming Problem 5.27

  public int getY()  // See Programming Problem 5.27

  public void move(int direction) {
    switch (direction) {
      case Direction.NORTH: --y;  break;
      case Direction.EAST : ++x;  break;
      case Direction.SOUTH: ++y;  break;
      case Direction.WEST : --x;  break;
    }
  }  

  public Location adjacent(int direction) {
    switch (direction) {
      case Direction.NORTH: return new Location(x, y-1);
      case Direction.EAST : return new Location(x+1, y);
      case Direction.SOUTH: return new Location(x, y+1);
      case Direction.WEST : return new Location(x-1, y);
    }
    return null;
  }  

  public String toString()  // See Programming Problem 5.27 on page 161
}

/*  Output:
7.0 A 2.0 = 9.0
8.0 D 4.0 = 2.0
5.0 S 2.0 = 3.0
9.0 M 3.0 = 27.0
*/
