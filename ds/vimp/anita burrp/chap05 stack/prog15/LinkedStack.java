package chap05.prog15;

import chap05.list01.Stack;

public class LinkedStack implements Stack {
  private Node top;
  private int size;

  public boolean isEmpty() {
    return size==0;
  }

  public Object peek() {
    if (size==0) throw new java.util.NoSuchElementException();
    return top.object;
  }

  public Object pop() {
    if (size==0) throw new java.util.NoSuchElementException();
    Object oldTop=top.object;
    top = top.next;
    --size;
    return oldTop;
  }

  public void push(Object object) {
    top = new Node(object,top);
    ++size;
  }

  public void reverse() {
      int n=size;
      Object[] objects = new Object[size];
      for (int i=0; i<n; i++)
          objects[i] = pop();
      for (int i=0; i<n; i++)
          push(objects[i]);
  }

  public int size() {
    return size;
  }

  private static class Node {
    Object object;
    Node next;
    Node(Object object, Node next) {
      this.object=object;
      this.next=next;
    }
  }
    
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.reverse();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
