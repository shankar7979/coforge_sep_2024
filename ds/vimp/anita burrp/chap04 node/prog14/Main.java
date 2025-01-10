package chap04.prog14;

//import chap04.list15.LinkedList;

public class Main {
    
    public Main() {
        LinkedList list = new LinkedList();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}

class LinkedList {
  private Node start;

  Node interleaved(Node list1, Node list2) {
      Node x = new Node(list1.data);
      return x;
  }

  public void insert(Node start, int x) {
    // precondition: the list is in ascending order;
    // postconditions: the list is in ascending order, and it contains x;
    if (start==null || start.data>x) {
      start = new Node(x,start);
      return;
    }
    Node p=start;
    while (p.next!=null) {
      if (p.next.data>x)  break;
      p = p.next;
    }
    p.next = new Node(x,p.next);
  }

  public void delete(Node start, int x) {
    // precondition: the list is in ascending order;
    // postconditions: the list is in ascending order, and if it did
    // contains x, then the first occurrence of x has been deleted;
    if (start==null || start.data>x) return;  // x is not in the list
    if (start.data==x) {
      start = start.next;    // delete x
      return;
    }
    Node p=start;
    while (p.next!=null) {
      if (p.next.data>x)  break;
      p = p.next;
    }
    if (p.next.data==x) p.next = p.next.next;  // delete x
  }

  private static class Node {
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
