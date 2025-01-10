//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob11\TestMerged.java

package chap04.prob11;

public class TestMerged {
  
  public TestMerged() {
    Node list1 = newList(new int[]{22,33,55,88});
    print(list1);
    Node list2 = newList(new int[]{44,66,77,99});
    print(list2);
    Node list3 = merged(list1, list2);
    print(list3);
  }

  Node merged(Node list1, Node list2) {
    Node list = new Node(0), p=list, p1=list1, p2=list2;
    while (p1 != null && p2 != null) {
      if (p1.data < p2.data) {
        p = p.next = new Node(p1.data);
        p1 = p1.next;
      } else {
        p = p.next = new Node(p2.data);
        p2 = p2.next;
      }
    }
    while (p1 != null) {
      p = p.next = new Node(p1.data);
      p1 = p1.next;
    }
    while (p2 != null) {
      p = p.next = new Node(p2.data);
      p2 = p2.next;
    }
    return list.next;
  }

  private Node newList(int[] a) {
    Node list = new Node(a[0]), p=list;
    for (int i=1; i<a.length; i++)
      p = p.next = new Node(a[i]);
    return list;
  }

  private void print(Node list) {
    System.out.print("{" + list.data);
    Node p = list.next;
    while (p != null) {
      System.out.print(", " + p.data);
      p = p.next;
    }
    System.out.println("}");;
  }
  
  public static void main(String[] args) {
    new TestMerged();
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
{22, 33, 55, 88}
{44, 66, 77, 99}
{22, 33, 44, 55, 66, 77, 88, 99}
*/

