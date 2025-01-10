//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob06\TestSublist.java

package chap04.prob06;

public class TestSublist {
    TestSublist() {
        Node list = new Node(99);
        list = new Node(88, list);
        list = new Node(77, list);
        list = new Node(66, list);
        list = new Node(55, list);
        list = new Node(44, list);
        list = new Node(33, list);
        list = new Node(22, list);
        print(list);
        Node clone = sublist(list, 2, 7);
        print(clone);
        print(list);
        clone.next.data = 11;
        print(clone);
        print(list);
    }

  Node sublist(Node list, int m, int n) {
    if (m < 0 || n < m) throw new IllegalArgumentException();
    if (n == m) return null;
    for (int i=0; i<m; i++)
      list = list.next;
    Node clone = new Node(list.data);
    Node p=list, q=clone;
    for (int i=m+1; i<n; i++) {
      if (p.next == null) throw new IllegalArgumentException();
      q.next = new Node(p.next.data);
      p = p.next;
      q = q.next;
    }
    return clone;
  }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestSublist();
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
44 55 66 77 88 
22 33 44 55 66 77 88 99 
44 11 66 77 88 
22 33 44 55 66 77 88 99 
*/
