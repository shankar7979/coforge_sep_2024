//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\prob02\TestSum.java

package chap04.prob02;

public class TestSum {
    TestSum() {
        Node list = new Node(85);
        list = new Node(65, list);
        list = new Node(45, list);
        list = new Node(25, list);
        print(list);
        System.out.println("sum(list): " + sum(list));
        print(list);
    }

    int sum(Node list) {
        int sum = 0;
        while (list != null) {
            sum += list.data;
            list = list.next;
        }
        return sum;
    }

    void print(Node start) {
        for (Node p=start; p!=null; p=p.next)
            System.out.print(p.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new TestSum();
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
25 45 65 85 
sum(list): 220
25 45 65 85 
*/
