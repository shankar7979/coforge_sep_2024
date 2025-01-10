//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob12\TestMerged.java

package chap04.prob12;

public class TestShuffle {
  
  public TestShuffle() {
    Node list = newList(new int[]{22,33,44,55,66,77,88,99});
    print(list);
    shuffle(list);
    print(list);
  }

  private void shuffle(Node list) {
    Node p=list, q=list;
    while (p != null) {
      p = p.next;
      if (p != null) p = p.next;
      q = q.next;
    }
    // now q = middle node:
    Node m = q;
    p = list;
    Node t=p.next, tt=m.next;
    while (m.next != null) {
      tt = m.next;
      p.next = m;
      p = m.next = t;
      t = p.next;
      m = tt;
    }
    p.next = m;
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
    new TestShuffle();
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
{22, 33, 44, 55, 66, 77, 88, 99}
{22, 66, 33, 77, 44, 88, 55, 99}
*/
