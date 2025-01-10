//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob01\IntArrayStack.java

package chap05.prob01;

public class IntArrayStack {
  private int[] a;
  private int size;

  public IntArrayStack(int capacity) {
    a = new int[capacity];
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public int peek() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    return a[size-1];
  }

  public int pop() {
    if (size == 0) throw new IllegalStateException("stack is empty");
    int n = a[--size];
    return n;
  }

  public void push(int n) {
    if (size == a.length) resize();
    a[size++] = n;
  }

  public int size() {
    return size;
  }

  private void resize() {
    int[] aa = a;
    a = new int[2*aa.length];
    System.arraycopy(aa, 0, a, 0, size);
  }
}
