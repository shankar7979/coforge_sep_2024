//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list05\TestNode.java

package chap04.list05;

public class TestNode {
    public TestNode() {
        Node start = new Node(22);
        Node p=start;
        p.next = new Node(33);
        p = p.next;
        p.next = new Node(44);
        p = p.next;
        p.next = new Node(55);
        p = p.next;
        p.next = new Node(66);
    }

    public static void main(String[] args) {
        new TestNode();
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
