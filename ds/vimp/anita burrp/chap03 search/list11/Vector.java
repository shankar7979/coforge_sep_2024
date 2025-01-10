//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list11\Vector.java

package chap03.list11;

public class Vector {
  protected Object[] objects;       // backing array
  protected int size;               // actual number of Objects stored
  protected static final int CAPACITY=10;  // default array length

  public Vector(int capacity) {
    if (capacity<=0) throw new IllegalArgumentException("capacity<=0");
    objects = new Object[capacity];
  }

  public Vector() {
    this(CAPACITY);
  }

  public int size() {
    return size;
  }

  public String toString() {
    if (size == 0) return "()";
    StringBuffer buf = new StringBuffer("(" + objects[0]);
    for (int i = 1; i < size; i++)
      buf.append("," + objects[i]);
    return buf + ")";
  }

  //...

  protected void resize() {
    int n=objects.length;
    Object[] temp = new Object[2*n];
    System.arraycopy(objects, 0, temp, 0, n);
    objects = temp;
  }
}
