//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob08\TestConcat.java

package chap04.prob08;

public class TestConcat {
    TestConcat() {
        Node list1 = new Node(55);
        list1 = new Node(44, list1);
        list1 = new Node(33, list1);
        list1 = new Node(22, list1);
        Node list2 = new Node(99);
        list2 = new Node(88, list2);
        list2 = new Node(77, list2);
        list2 = new Node(66, list2);
        print(list1);
        print(list2);
        Node list3 = concat(list1, list2);
        print(list1);
        print(list2);
        print(list3);
        list1.data = 20;
        list2.next.data = 70;
        list3.next.next.data = 40;
        print(list1);
        print(list2);
        print(list3);
    }

  Node concat(Node list1, Node list2) {
    Node list3 = new Node(0), p=list1, q=list3;
    while (p != null) {
      q.next = new Node(p.data);
      p = p.next;
      q = q.next;
    }
    p=list2;
    while (p != null) {
      q.next = new Node(p.data);
      p = p.next;
      q = q.next;
    }
    return list3.next;  // discard dummy head node
  }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestConcat();
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
22 33 44 55 
66 77 88 99 
22 33 44 55 
66 77 88 99 
22 33 44 55 66 77 88 99 
20 33 44 55 
66 70 88 99 
22 33 40 55 66 77 88 99 
*/
