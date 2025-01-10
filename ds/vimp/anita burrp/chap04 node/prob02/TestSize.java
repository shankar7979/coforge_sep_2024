//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob02\TestSize.java

package chap04.prob02;

public class TestSize {
  TestSize() {
    Node list = new Node(88);
    list = new Node(77, list);
    list = new Node(66, list);
    list = new Node(55, list);
    list = new Node(44, list);
    list = new Node(33, list);
    print(list);
    System.out.println("size(list): " + size(list));
    print(list);
  }

  int size(Node list) {
    int count = 0;
    while (list != null) {
      ++count;
      list = list.next;
    }
    return count;
  }

  void print(Node start) {
    for (Node p=start; p!=null; p=p.next)
      System.out.print(p.data + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    new TestSize();
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
size(list): 6
33 44 55 66 77 88 
*/
