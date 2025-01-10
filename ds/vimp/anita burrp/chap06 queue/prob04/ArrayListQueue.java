//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob04\ArrayListQueue.java

package chap06.prob04;

import chap06.list01.Queue;
import java.util.ArrayList;

public class ArrayListQueue implements Queue {
  private ArrayList a;

  public ArrayListQueue(int capacity) {
    a = new ArrayList(capacity);
  }

  public void add(Object object) {
    a.add(object);
  }

  public Object first() {
    if (size() == 0) throw new IllegalStateException("queue is empty");
    return a.get(0);
  }

  public boolean isEmpty() {
    return a.isEmpty();
  }

  public Object remove() {
    if (size() == 0) throw new IllegalStateException("queue is empty");
    return a.remove(0);
  }

  public int size() {
    return a.size();
  }
}
