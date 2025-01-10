//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob09\TestReplace.java

package chap04.prob09;

public class TestReplace {
    TestReplace() {
        Node list = new Node(99);
        list = new Node(88, list);
        list = new Node(77, list);
        list = new Node(66, list);
        list = new Node(55, list);
        list = new Node(44, list);
        list = new Node(33, list);
        list = new Node(22, list);
        print(list);
        replace(list, 2, 50);
        print(list);
        replace(list, 5, 80);
        print(list);
    }

    void replace(Node list, int i, int x) {
        if (i < 0) throw new IllegalArgumentException();
        for (int j=0; j<i; j++) {
            if (list == null) throw new IllegalStateException();
            list = list.next;
        }
        list.data = x;
        return;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestReplace();
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
22 33 50 55 66 77 88 99 
22 33 50 55 66 80 88 99 
*/
