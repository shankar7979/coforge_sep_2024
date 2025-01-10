//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob14\LinkedStack.java

package chap05.prob14;

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

  public void push(Object object) {
    top = new Node(object,top);
    ++size;
  }

  public void reverse() {
    if (size < 2) return;
    LinkedStack stack1 = new LinkedStack();
    LinkedStack stack2 = new LinkedStack();
    while (this.size > 0)
      stack1.push(this.pop());
    while (stack1.size > 0)
      stack2.push(stack1.pop());
    while (stack2.size > 0)
      this.push(stack2.pop());
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
