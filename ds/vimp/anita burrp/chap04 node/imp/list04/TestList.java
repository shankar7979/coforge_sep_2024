//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list04\TestList.java

package chap04.list04;

public class TestList {
  public TestList() {
    Node start = new Node(22);
    start.next = new Node(33);
    start.next.next = new Node(44);
    start.next.next.next = new Node(55);
    start.next.next.next.next = new Node(66);
    print(start);
  }

  public static void print(Node list) {
    while (list != null) {
      System.out.print(list.data + " ");
      list = list.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    new TestList();
  }

  class Node {
    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}

/*  Output:
22 33 44 55 66 
*/
