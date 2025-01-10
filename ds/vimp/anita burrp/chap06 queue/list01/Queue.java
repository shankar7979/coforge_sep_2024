//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\list01\Stack.java

package chap06.list01;

/**
 * The <code>Queue</code> interface specifies the basic operations
 * of a first-in-first-out (FIFO) containers.
 */
public interface Queue {

    /**
     * Adds the specified element to the back of this queue.
     *
     * @param  object  the element to be added to this queue.
     */
    void add(Object object);
    
    /**
     * Returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    Object first();
    
    /**
     * Removes and returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    Object remove();

    /**
     * Returns the number of elements in this queue.
     *
     * @return  the number of elements in this queue.
     */
    int size();
}
