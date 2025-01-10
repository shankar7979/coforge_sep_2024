//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob07\TestAppend.java

package chap04.prob07;

public class TestAppend {
    TestAppend() {
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
        append(list1, list2);
        print(list1);
        print(list2);
    }

    void append(Node list1, Node list2) {
        if (list1 == null) throw new IllegalStateException();
        while (list1.next != null) {
            list1 = list1.next;
        }
        list1.next = list2;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestAppend();
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
22 33 44 55 66 77 88 99 
66 77 88 99 
*/
