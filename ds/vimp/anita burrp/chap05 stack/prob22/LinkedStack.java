//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob22\LinkedStack.java

package chap05.prob22;

import chap05.list01.Stack;

/**
 * The <code>LinkedStack</code> class implements the <code>Stack</code> 
 * interface defined in the <code>chap05.list01</code> package. Its
 * instances are last-in-first-out (LIFO) containers that store their
 * elements in a backing array.
 */
public class LinkedStack implements Stack {
  private Node top;
  private int size;

  /**
   * Reports whether this stack is empty.
   *
   * @return  <code>true</code> if and only if this stack contains
   *          no elements.
   */
   public boolean isEmpty() {
    return (size == 0);
  }

  /**
   * Returns a reference to the top element on this stack, leaving
   * the stack unchanged.
   *
   * @return     the top element on this stack.
   * @exception  IllegalStateException  if this stack is empty.
   */
  public Object peek() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    return top.object;
  }

  /**
   * Removes the top element on this stack and returns it.
   *
   * @return     the top element on this stack.
   * @exception  IllegalStateException  if this stack is empty.
   */
  public Object pop() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    Object oldTop = top.object;
    top = top.next;
    --size;
    return oldTop;
  }

  /**
   * Inserts the specified object onto the top of this stack.
   *
   * @param  object  the element to be pushed onto this stack.
   */
  public void push(Object object) {
    top = new Node(object,top);
    ++size;
  }

  /**
   * Returns the number of elements in this stack.
   *
   * @return  the number of elements in this stack.
   */
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
