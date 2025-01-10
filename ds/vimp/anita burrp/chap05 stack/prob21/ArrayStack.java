//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob21\ArrayStack.java

package chap05.prob21;

import chap05.list01.Stack;

/**
 * The <code>ArrayStack</code> class implements the <code>Stack</code> 
 * interface defined in the <code>chap05.list01</code> package. Its
 * instances are last-in-first-out (LIFO) containers that store their
 * elements in a backing array.
 */
public class ArrayStack implements Stack {
  private Object[] a;
  private int size;

  /**
   * Creates an empty stack with a specified capacity.
   *
   * @param  capacity  the length of the backing array.
   */
  public ArrayStack(int capacity) {
    a = new Object[capacity];
  }

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
    return a[size-1];
  }

  /**
   * Removes the top element on this stack and returns it.
   *
   * @return     the top element on this stack.
   * @exception  IllegalStateException  if this stack is empty.
   */
  public Object pop() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    Object object=a[--size];
    a[size] = null;
    return object;
  }

  /**
   * Inserts the specified object onto the top of this stack.
   *
   * @param  object  the element to be pushed onto this stack.
   */
  public void push(Object object) {
    if (size == a.length) resize();
    a[size++] = object;
  }

  /**
   * Returns the number of elements in this stack.
   *
   * @return     the number of elements in this stack.
   */
  public int size() {
    return size;
  }

  private void resize() {
    Object[] aa = a;
    a = new Object[2*aa.length];
    System.arraycopy(aa, 0, a, 0, size);
  }
}
