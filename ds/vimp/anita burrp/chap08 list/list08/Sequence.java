//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list08\Sequence.java

package chap08.list08;

import java.util.*;

public class Sequence extends AbstractSequentialList {
  private Node head = new Node(null,null,null);
  private int size;
  public Sequence() {
    head.prev = head.next = head;
  }
  public Sequence(Collection collection) {
    this();
    addAll(collection);
  }
  public ListIterator listIterator(int index) { // required override 
    return new SequenceIterator(index);
  }
  public int size() {  // required override 
    return size;
  }
  private static class Node {
    Node prev, next;
    Object object;
    Node(Node p, Node n, Object o) {
      this.prev=p; this.next=n; this.object=o;
    }
  }

  private class SequenceIterator implements ListIterator {
    private Node last, next;
    private int nextIndex;

    public SequenceIterator(int i) {
      if (i<0 || i>size) throw new IndexOutOfBoundsException();
      nextIndex = i;
      next = head.next;
      for (int j=0; j<i; j++)
        next = next.next;
    }

    public void add(Object object) {
      Node newNode = new Node(next.prev,next,object);
      newNode.prev.next = next.prev = newNode;
      ++size;
      ++nextIndex;
      last = null;
    }

    public boolean hasNext() {
      return nextIndex<size;
    }

    public boolean hasPrevious() {
      return nextIndex>0;
    }

    public Object next() {
      if (!hasNext()) throw new NoSuchElementException();
      last = next;
      next = next.next;
      ++nextIndex;
      return last.object;
    }

    public int nextIndex() {
      return nextIndex;
    }

    public Object previous() {
      if (!hasPrevious()) throw new NoSuchElementException();
      next = last = next.prev;
      --nextIndex;
      return last.object;
    }

    public int previousIndex() {
      return nextIndex-1;
    }

    public void remove() {
      if (last==null) throw new IllegalStateException();
      last.prev.next = last.next;
      last.next.prev = last.prev;
      last = null;
      --size;
      --nextIndex;
    }

    public void set(Object object) {
      if (last==null) throw new IllegalStateException();
      last.object = object;
    }
  }
}
