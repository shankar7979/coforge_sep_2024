//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list09\TestNode.java

package chap04.list09;

public class TestNode {
  public static void main(String[] args) {
    Node start = new Node(22);
    Node p=start;
    for (int i=1; i<5; i++)
      p = p.next = new Node(22+11*i);
    for (p=start; p!=null; p=p.next)
      System.out.println(p.data);
    for (p=start; p!=null; p=p.next)
      System.out.println(p);
  }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

/*  Output:
22
33
44
55
66
chap04.list09.Node@1
chap04.list09.Node@2
chap04.list09.Node@3
chap04.list09.Node@4
chap04.list09.Node@5
*/
