//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob03\LinkedQueue.java

package chap06.prob03;

import chap06.list01.Queue;

/**
 * The <code>LinkedQueue</code> class implements the <code>Queue</code> 
 * interface defined in the <code>chap06.list01</code> package. Its
 * instances are first-in-first-out (FIFO) containers that store their
 * elements in a backing array.
 */
public class LinkedQueue implements Queue {
    private Node head = new Node(null);
    private int size;

    /**
     * Adds the specified element to the back of this queue.
     *
     * @param  object  the element to be added to this queue.
     */
    public void add(Object object) {
        head.prev = head.prev.next = new Node(object,head.prev,head);
        ++size;
    }
    
    /**
     * Returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    public Object first() {
        if (size==0) throw new IllegalStateException("the queue is empty");
        return head.next.object;
    }

    /**
     * Reports whether this queue is empty.
     *
     * @return  <code>true</code> if and only if this queue contains
     *          no elements.
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Removes and returns the element at the front of this queue.
     *
     * @return  the element at the front of this queue.
     * @throws  IllegalStateException  if this queue is empty
     */
    public Object remove() {
        if (size==0) throw new IllegalStateException("the queue is empty");
        Object object=head.prev.object;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return object;
    }

    /**
     * Returns the number of elements in this queue.
     *
     * @return  the number of elements in this queue.
     */
    public int size() {
        return size;
    }

    private static class Node {
        Object object;
        Node prev=this, next=this;

        Node(Object object) {
            this.object=object;
        }

        Node(Object object, Node prev, Node next) {
            this.object=object;
            this.prev=prev;
            this.next=next;
        }
    }
}
