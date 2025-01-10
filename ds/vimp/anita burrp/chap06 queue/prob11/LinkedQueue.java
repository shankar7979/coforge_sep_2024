//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob11\LinkedQueue.java

package chap06.prob11;

import chap06.list01.Queue;
import chap06.prob01.ArrayQueue;

public class LinkedQueue implements Queue {
  private Node head = new Node(null);
  private int size;

  public void add(Object object) {
    head.prev = head.prev.next = new Node(object,head.prev,head);
    ++size;
  }

  public Object first() {
    if (size==0) throw new IllegalStateException("the queue is empty");
    return head.next.object;
  }

  public boolean isEmpty() {
    return size==0;
  }

  public Object remove() {
    if (size==0) throw new IllegalStateException("the queue is empty");
    Object object=head.next.object;
    head.next = head.next.next;
    head.next.prev = head;
    --size;
    return object;
  }

  public int size() {
    return size;
  }

  public ArrayQueue toArrayQueue() {
    ArrayQueue q = new ArrayQueue(2*size);
    for (Node p=head; p!=null; p = p.next)
      q.add(p.object);
    return q;
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

