//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list15\LinkedList.java

package chap04.list15;

public class LinkedList {
  private Node start;

  public void insert(int x) {
    // precondition: the list is in ascending order;
    // postconditions: the list is in ascending order, and it contains x;
    if (start==null || start.data>x) {
      start = new Node(x,start);
      return;
    }
    Node p=start;
    while (p.next!=null) {
      if (p.next.data>x)  break;
      p = p.next;
    }
    p.next = new Node(x,p.next);
  }

  public void delete(int x) {
    // precondition: the list is in ascending order;
    // postconditions: the list is in ascending order, and if it did
    // contains x, then the first occurrence of x has been deleted;
    if (start==null || start.data>x) return;  // x is not in the list
    if (start.data==x) {   // x is the first element in the list
      start = start.next;   // so delete first node
      return;
    }
    for ( Node p=start; p.next!=null ; p = p.next ) {
      if (p.next.data> x )  break; // x is not in the list
      if (p.next.data==x) {   // x is in the p.next node
        p.next = p.next.next;  // delete it
        break ;
      }
      p = p.next;
    }
  }

  private static class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
  }
}