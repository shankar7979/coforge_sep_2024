//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob18\TestReverse.java

package chap06.prob18;

import chap06.list01.Queue;
import chap06.prob07.LinkedQueue;
import chap05.list01.Stack;
import chap05.list02.ArrayStack;

public class TestReverse {
  public TestReverse() {
    Queue q = new LinkedQueue();
    q.add("Sara");
    q.add("John");
    q.add("Andy");
    q.add("Mike");
    System.out.println("q: " + q);
    reverse(q);
    System.out.println("q: " + q);
  }

  public static void main(String[] args) {
    new TestReverse();
  }

  void reverse(Queue q) {
    int n = q.size();
    if (n<2) return;
    Stack s = new ArrayStack(n);
    for (int i=0; i<n; i++)
      s.push(q.remove());
    for (int i=0; i<n; i++)
      q.add(s.pop());
  }
}

/*  Output:
q: (Sara,John,Andy,Mike)
q: (Mike,Andy,John,Sara)
*/