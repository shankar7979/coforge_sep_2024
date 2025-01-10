//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list12\TestInsert.java

package chap04.list12;

public class TestInsert {
    TestInsert() {
        Node start = null;
        start = insert(start, 44);
        print(start);
        start = insert(start, 88);
        print(start);
        start = insert(start, 33);
        print(start);
        start = insert(start, 66);
        print(start);
    }

    Node insert(Node start, int x) {
        // PRECONDITIONS: the list is in ascending order;
        // POSTCONDITIONS: the list is in ascending order, and it contains x;
        if (start == null || start.data > x) {
            start = new Node(x,start);
            return start;
        }
        Node p = start;
        while (p.next != null) {
            if (p.next.data > x)  break;
                p = p.next;
        }
        p.next = new Node(x,p.next);
        return start;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
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
44 
44 88 
33 44 88 
33 44 66 88 
*/
