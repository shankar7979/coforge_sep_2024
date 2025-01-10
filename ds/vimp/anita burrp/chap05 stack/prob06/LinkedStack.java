//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob06\LinkedStack.java

package chap05.prob06;

import chap05.list01.Stack;

public class LinkedStack implements Stack {
  private Node top;
  private int size;

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof LinkedStack)) return false;
    LinkedStack that = (LinkedStack)obj;
    if (that.size != this.size) return false;
    Node p=this.top, q = that.top;
    while (p != null && q != null) {
      if (!p.object.equals(q.object)) return false;
      p = p.next;
      q = q.next;
    }
    return true;
  }

  public Object peek() {
    if (size == 0) throw new java.util.NoSuchElementException();
    return top.object;
  }

  public Object pop() {
    if (size == 0) throw new java.util.NoSuchElementException();
    Object oldTop = top.object;
    top = top.next;
    --size;
    return oldTop;
  }

  public void push(Object object) {
    top = new Node(object,top);
    ++size;
  }

  public int size() {
    return size;
  }

  private static class Node {
    Object object;
    Node next;
    Node(Object object, Node next) {
      this.object = object;
      this.next = next;
    }
  }
}
