//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob02\ArrayListStack.java

package chap05.prob02;

import chap05.list01.Stack;
import java.util.ArrayList;

public class ArrayListStack implements Stack {
  private ArrayList a;

  public ArrayListStack(int capacity) {
    a = new ArrayList(capacity);
  }

  public boolean isEmpty() {
    return (a.isEmpty());
  }

  public Object peek() {
    int n = a.size();
    if (n == 0) throw new IllegalStateException("stack is empty");
    return a.get(n-1);
  }

  public Object pop() {
    int n = a.size();
    if (n == 0) throw new IllegalStateException("stack is empty");
    return a.remove(n-1);
  }

  public void push(Object object) {
    a.add(object);
  }

  public int size() {
    return a.size();
  }
}
