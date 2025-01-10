package chap04.prog07;

import chap04.list10.Node;

public class Main {
    
    public Main() {
    }
    
    void swap(Node list, int i, int j) {
        
    }

    public static void main(String[] args) {
        System.out.println(new java.util.Date());
    }
    
    Node sampleList() {
        Node start = new Node(22);
        Node p=start;
        for (int i=1; i<5; i++)
            p = p.next = new Node(22+11*i);
/*
        for (p=start; p!=null; p=p.next)
            System.out.println(p.data);
        for (p=start; p!=null; p=p.next)
            System.out.println(p);
*/
    }
}
