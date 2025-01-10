//  TestMerge.java

package chap04.prog11;

public class TestMerge {

    public TestMerge() {
        Node list1 = new Node(33);
        Node list2 = new Node(22);
        Node p = list1.next = new Node(44);
        p = p.next = new Node(77);
        p.next = new Node(88);
        p = list2.next = new Node(55);
        p = p.next = new Node(66);
        p.next = new Node(99);
        print(list1);
        print(list2);
        print(merge(list1,list2));
    }    

    void print(Node list) {
        while (list!=null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
        System.out.println();
    }

    Node merge(Node list1, Node list2) {
        if (list1==null && list2==null) return null;
        Node list=null, p1=list1, p2=list2;
        if (p1==null) {
            list = new Node(p2.data);
            p2 = p2.next;
        } else if (p2==null) {
            list = new Node(p1.data);
            p1 = p1.next;
        }
        if (p1.data<p2.data) {
            list = new Node(p1.data);
            p1 = p1.next;
        } else {
            list = new Node(p2.data);
            p2 = p2.next;
        }
        Node p=list;
        while (p1!=null && p2!=null)
            if (p1.data<p2.data) {
                p = p.next = new Node(p1.data);
                p1 = p1.next;
            } else {
                p = p.next = new Node(p2.data);
                p2 = p2.next;
            }
        while (p1!=null) {
            p = p.next = new Node(p1.data);
            p1 = p1.next;
        }
        p.next = p2;
        return list;
    }

    public static void main(String[] args) {
        new TestMerge();
    }
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}

/*  Output
33 44 77 88 
22 55 66 99 
22 33 44 55 66 77 88 99 
*/
