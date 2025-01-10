//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob08\LinkedStack.java

package chap05.prob08;

import chap05.list01.Stack;
import chap05.list02.ArrayStack;

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

  public int size() {
    return size;
  }


  public ArrayStack toArrayStack() {
  ArrayStack temp = new ArrayStack(2*size);
  for (Node p=top; p!=null; p = p.next)
    temp.push(p.object);
  ArrayStack s = new ArrayStack(2*size);
    for (Node p=top; p!=null; p = p.next)
      s.push(temp.pop());
    return s;
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
