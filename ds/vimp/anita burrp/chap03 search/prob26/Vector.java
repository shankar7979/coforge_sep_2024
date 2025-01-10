//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob26\Vector.java

package chap03.prob26;

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

  public Object elementAt(int i) {
    // Returns the element at index i in this vector.
    return objects[i];
  }

  public Object firstElement() {
    // Returns the first element in this vector.
    return objects[0];
  }

  public Object lastElement() {
    // Returns the last element in this vector.
    return objects[size-1];
  }

  public void setElementAt(Object x, int i) {
    // Replaces the element at index i with x.
    objects[i] = x;
  }

    public int size() {
        return size;
    }

    public String toString() {
        if (size == 0) return "()";
        StringBuffer buf = new StringBuffer("(" + objects[0]);
        for (int i = 1; i < size; i++)
            buf.append("," + objects[i]);
        return buf + ")";
    }

    protected void resize() {
        int n=objects.length;
        Object[] temp = new Object[2*n];
        System.arraycopy(objects, 0, temp, 0, n);
        objects = temp;
    }

    public static void main(String[] args) {
        Vector v = new Vector(new String[]{"CA","US","MX","AR","BR","CH"});
        System.out.println("v: " + v);
        System.out.println("v.elementAt(3): " + v.elementAt(3));
        System.out.println("v.firstElement(): " + v.firstElement());
        System.out.println("v.lastElement(): " + v.lastElement());
        v.setElementAt("CO", 3);
        System.out.println("v: " + v);
    }
}

/*  Output:
v: (CA,US,MX,AR,BR,CH)
v.elementAt(3): AR
v.firstElement(): CA
v.lastElement(): CH
v: (CA,US,MX,CO,BR,CH)
*/
