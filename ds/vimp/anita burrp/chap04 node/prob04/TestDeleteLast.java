//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob04\TestDeleteLast.java

package chap04.prob04;

public class TestDeleteLast {
  TestDeleteLast() {
    Node list = new Node(88);
    list = new Node(77, list);
    list = new Node(66, list);
    list = new Node(55, list);
    list = new Node(44, list);
    list = new Node(33, list);
    print(list);
    deleteLast(list);
    print(list);
    deleteLast(list);
    print(list);
    deleteLast(list);
    print(list);
  }

  void deleteLast(Node list) {
    if (list == null || list.next == null) 
      throw new IllegalStateException();
    while (list.next.next != null) {
      list = list.next;
    }
    list.next = null;
  }

  void print(Node start) {
    for (Node p=start; p!=null; p=p.next)
      System.out.print(p.data + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    new TestDeleteLast();
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
33 44 55 66 77 88 
33 44 55 66 77 
33 44 55 66 
33 44 55 
*/
