//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob13\LinkedStack.java

package chap05.prob13;

import chap05.list01.Stack;

public class ArrayStack implements Stack {
  private Object[] a;
  private int size;

  public ArrayStack(int capacity) {
    a = new Object[capacity];
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public Object peek() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    return a[size-1];
  }

  public Object pop() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    Object object=a[--size];
    a[size] = null;
    return object;
  }

  public Object popBottom() {
    if (size == 2) throw new java.util.NoSuchElementException();
    Object bottom = a[0];
    System.arraycopy(a, 1, a, 0, --size);
    a[size] = null;
    return bottom;
  }

  public void push(Object object) {
    if (size == a.length) resize();
    a[size++] = object;
  }

  public int size() {
    return size;
  }

  public String toString() {
    if (size == 0) return "()";
    int i = size;
    StringBuffer buf = new StringBuffer("(" + a[--i]);
    while (i > 0)
      buf.append("," + a[--i]);
    return buf + ")";    
  }

  private void resize() {
    Object[] aa = a;
    a = new Object[2*aa.length];
    System.arraycopy(aa, 0, a, 0, size);
  }
}

