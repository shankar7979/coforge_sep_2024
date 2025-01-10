//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob08\LinkedQueue.java

package chap06.prob08;

import chap06.list01.Queue;

public class LinkedQueue implements Queue {
  private Node head = new Node(null);
  private int size;

  public void add(Object object) {
    head.prev = head.prev.next = new Node(object,head.prev,head);
    ++size;
  }

  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof LinkedQueue)) return false;
    LinkedQueue that = (LinkedQueue)obj;
    if (that.size != this.size) return false;
    Node p=this.head, q = that.head;
    while (p != null && q != null) {
      if (!p.object.equals(q.object)) return false;
      p = p.next;
      q = q.next;
    }
    return true;
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

  public String toString() {
    if (size == 0) return "()";
    StringBuffer buf = new StringBuffer("(" + head.object);
    for (Node p=head.next; p!=null; p = p.next)
      buf.append("," + p.object);
    return buf + ")";    
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
