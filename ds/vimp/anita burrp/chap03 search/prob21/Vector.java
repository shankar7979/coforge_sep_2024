//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob21\Vector.java

package chap03.prob21;

public class Vector {
    protected Object[] objects;       // backing array
    protected int size;               // actual number of Objects stored
    protected static final int CAPACITY=10;  // default array length

    public Vector(int capacity) {
        if (capacity<=0) throw new IllegalArgumentException("capacity<=0");
        objects = new Object[capacity];
    }

    public Vector() {
        this(CAPACITY);
    }

    public Vector(Object[] a) {
        int n = a.length;
        objects = new Object[2*n];
        System.arraycopy(a,0,objects,0,n);
        size = n;
    }

    public int size() {
        return size;
    }

  public void copyInto(Object[] a) {
    // Replaces the first n elements of a[] with the n elements of
    // this vector, where n is the size of this vector.
    if (size > a.length) throw new IllegalArgumentException();
    for (int i=0; i<size; i++)
      a[i] = objects[i];
  }

    protected void resize() {
        int n=objects.length;
        Object[] temp = new Object[2*n];
        System.arraycopy(objects, 0, temp, 0, n);
        objects = temp;
    }

    public static void main(String[] args) {
        Vector v = new Vector(new String[]{"CA","US","MX","AR","BR","CH"});
        Object[] a = new String[10];
        v.copyInto(a);
        for (int i=0; i<6; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

/*  Output:
CA US MX AR BR CH 
*/
