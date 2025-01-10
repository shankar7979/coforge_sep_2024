//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob15\TestReversejava

package chap06.prob15;
import chap06.list01.Queue;

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
    Object object=head.prev.object;
    head.next = head.next.next;
    head.next.prev = head;
    --size;
    return object;
  }

  public void reverse() {
    Node p = head.next;
    while (p != head) {
      Node temp = p.next;
      p.next = p.prev;
      p = p.prev = temp;
    }
    head.next = p.prev;
  }

  public String toString() {
    StringBuffer buf = new StringBuffer();
    for (Node p=head.next; p!=head; p = p.next)
      buf.append(p.object + " ");
    return buf.toString();
    }


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

/*  Output
kids.size(): 3
kids.first(): Sara
kids.remove(): Sara
kids.size(): 2
kids.first(): John
kids.size(): 3
kids.first(): John
kids.remove(): John
kids.size(): 2
kids.first(): Andy
kids.remove(): Andy
kids.size(): 1
kids.first(): Mike
kids.remove(): Mike
kids.size(): 0
java.lang.IllegalStateException: queue is empty
        java.lang.Object chap06.prob04.ArrayListQueue.first()
                ArrayListQueue.java:23
        void chap06.prob04.TestArrayListQueue.main(java.lang.String[])
                TestArrayListQueue.java:32
Exception in thread main
*/
