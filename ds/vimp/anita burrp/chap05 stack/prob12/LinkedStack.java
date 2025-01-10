//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob12\LinkedStack.java

package chap05.prob12;

import chap05.list01.Stack;

public class LinkedStack implements Stack {
  private Node top;
  private int size;

  public boolean isEmpty() {
    return (size == 0);
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

  public Object bottom() {
    if (size == 0) throw new java.util.NoSuchElementException();
    Node p = top;
    while (p.next != null)
        p =p.next;
    return p.object;
  }

  public void push(Object object) {
    top = new Node(object,top);
    ++size;
  }

  public int size() {
    return size;
  }

  public String toString() {
    if (size == 0) return "()";
    StringBuffer buf = new StringBuffer("(" + top.object);
    for (Node p=top.next; p!=null; p = p.next)
      buf.append("," + p.object);
    return buf + ")";    
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
