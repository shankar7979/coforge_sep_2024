//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list13\TestDelete.java

package chap04.list13;

public class TestDelete {
    TestDelete() {
        Node start = null;
        start = insert(start, 44);
        start = insert(start, 88);
        start = insert(start, 33);
        start = insert(start, 66);
        print(start);
        start = delete(start, 33);
        print(start);
        start = delete(start, 66);
        print(start);
        start = delete(start, 50);
        print(start);
        start = delete(start, 88);
        print(start);
        start = delete(start, 44);
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

    Node delete(Node start, int x) {
        // precondition: the list is in ascending order;
        // postconditions: the list is in ascending order, and if it did
        // contains x, then the first occurrence of x has been deleted;
        if (start == null || start.data > x) 
            return start;  // x is not in the list
        if (start.data==x) return start.next;
        for (Node p = start; p.next != null; p = p.next) {
            if (p.next.data > x)  break;  // x is not in the list
            if (p.next.data == x) {
                p.next = p.next.next;  // delete x
                break;
            }
        }
        return start;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestDelete();
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
33 44 66 88 
44 66 88 
44 88 
44 88 
44 
*/
