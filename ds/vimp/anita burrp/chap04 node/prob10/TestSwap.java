//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob10\TestSwap.java

package chap04.prob10;

public class TestSwap {
  TestSwap() {
    Node list = new Node(99);
    list = new Node(88, list);
    list = new Node(77, list);
    list = new Node(66, list);
    list = new Node(55, list);
    list = new Node(44, list);
    list = new Node(33, list);
    list = new Node(22, list);
    print(list);
    swap(list, 2, 5);
    print(list);
    swap(list, 6, 2);
    print(list);
  }

  void swap(Node list, int i, int j) {
    if (i < 0 || j < 0) throw new IllegalArgumentException();
    if (i == j) return;
    Node p=list, q=list;
    for (int ii=0; ii<i; ii++) {
      if (p == null) throw new IllegalStateException();
      p = p.next;
    }
    for (int jj=0; jj<j; jj++) {
      if (q == null) throw new IllegalStateException();
      q = q.next;
    }
    int pdata=p.data, qdata=q.data;
    p.data = qdata;
    q.data = pdata;
    return;
  }

  void print(Node start) {
    for (Node p=start; p!=null; p=p.next)
      System.out.print(p.data + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    new TestSwap();
  }

  class Node {
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

/*  Output:
22 33 44 55 66 77 88 99 
22 33 77 55 66 44 88 99 
22 33 88 55 66 44 77 99 
*/
