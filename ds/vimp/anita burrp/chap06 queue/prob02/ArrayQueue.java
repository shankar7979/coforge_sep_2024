//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob02\ArrayQueue.java

package chap06.prob02;

import chap06.list01.Queue;

/**
 * The <code>ArrayQueue</code> class implements the <code>Queue</code> 
 * interface defined in the <code>chap06.list01</code> package. Its
 * instances are first-in-first-out (FIFO) containers that store their
 * elements in a backing array.
 */
public class ArrayQueue implements Queue {
    private Object[] a;
    private int front, back;

    /**
     * Creates an empty queue with a specified capacity.
     *
     * @param  capacity  the length of the backing array.
     */
    public ArrayQueue(int capacity) {
        a = new Object[capacity];
    }

    /**
     * Adds the specified element to the back of this queue.
     *
     * @param  object  the element to be added to this queue.
     */
    public void add(Object object) {
        if (back == a.length) resize();
            a[back++] = object;
    }
    
    /**
     * Returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    public Object first() {
        if (size() == 0) throw new IllegalStateException("queue is empty");
        return a[front];
    }

    /**
     * Reports whether this queue is empty.
     *
     * @return  <code>true</code> if and only if this queue contains
     *          no elements.
     */
    public boolean isEmpty() {
        return (size() == 0);
    }

    /**
     * Removes and returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    public Object remove() {
        if (size() == 0) throw new IllegalStateException("queue is empty");
        Object object=a[front];
        a[front++] = null;
        return object;
    }

    /**
     * Returns the number of elements in this queue.
     *
     * @return  the number of elements in this queue.
     */
    public int size() {
        return back - front;
    }

  private void resize() {
    Object[] aa = a;
    a = new Object[2*aa.length];
    System.arraycopy(aa, front, a, 0, size());
  }
}
