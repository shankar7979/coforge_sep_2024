//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list11\TestInsert.java

package chap04.list11;

public class TestInsert {
    TestInsert() {
        Node start = init();
        print(start);
        insert(start, 50);
        print(start);
    }

    Node init() {
        Node start = new Node(22), p = start;
        for (int i=1; i<5; i++)
            p = p.next = new Node(22+11*i);
        return start;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    void insert(Node start, int x) {
      // PRECONDITIONS: the list is in ascending order, and x > start.data;
      // POSTCONDITIONS: the list is in ascending order, and it contains x;
      Node p = start;
      while (p.next != null) {
        if (p.next.data > x)  break;
         p = p.next;
      }
      p.next = new Node(x,p.next);
    }

    public static void main(String[] args) {
        new TestInsert();
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
22 33 44 55 66 
22 33 44 50 55 66 
*/
