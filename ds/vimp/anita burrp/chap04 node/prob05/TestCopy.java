//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob05\TestCopy.java

package chap04.prob05;

public class TestCopy {
  TestCopy() {
    Node list = new Node(88);
    list = new Node(66, list);
    list = new Node(44, list);
    list = new Node(22, list);
    print(list);
    Node clone = copy(list);
    print(clone);
    print(list);
    list.data = 33;
    clone.next.data = 55;
    print(list);
    print(clone);
  }

  Node copy(Node list) {
    if (list == null) return null;
    Node clone = new Node(list.data);
    for (Node p=list, q=clone; p.next != null; p=p.next, q=q.next)
      q.next = new Node(p.next.data);
    return clone;
  }

  void print(Node start) {
    for (Node p=start; p!=null; p=p.next)
      System.out.print(p.data + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    new TestCopy();
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
22 44 66 88 
22 44 66 88 
22 44 66 88 
33 44 66 88 
22 55 66 88 
*/
