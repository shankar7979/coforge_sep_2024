//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob16\TestRemoveSecond.java

package chap06.prob16;

import chap06.list01.Queue;
import chap06.list02.LinkedQueue;

public class TestRemoveSecond {
  public TestRemoveSecond() {
    Queue q = new LinkedQueue();
    q.add("Sara");
    q.add("John");
    q.add("Andy");
    q.add("Mike");
    System.out.println("q.size(): " + q.size());
    System.out.println("removeSecond(q): " + removeSecond(q));
    System.out.println("q.size(): " + q.size());
  }

  public static void main(String[] args) {
    new TestRemoveSecond();
  }

  Object removeSecond(Queue q) {
    int n = q.size();
    if (n<2) throw new IllegalArgumentException();
    q.add(q.remove());
    Object x = q.remove();
    for (int i=2; i<n; i++)
      q.add(q.remove());
    return x;
  }
}

/*  Output:
q.size(): 4
removeSecond(q): John
q.size(): 3
*/