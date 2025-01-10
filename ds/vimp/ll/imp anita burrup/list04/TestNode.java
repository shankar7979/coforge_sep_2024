//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list04\TestNode.java

package chap04.list04;

public class TestNode {
    public TestNode() {
        Node start = new Node(22);
        start.next = new Node(33);
        start.next.next = new Node(44);
        start.next.next.next = new Node(55);
        start.next.next.next.next = new Node(66);
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
