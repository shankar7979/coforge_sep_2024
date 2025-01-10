//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list06\TestNode.java

package chap04.list06;

public class TestNode {
    public TestNode() {
        Node start = new Node(22), p = start;
        for (int i=0; i<4; i++)
            p = p.next = new Node(33+11*i);
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
