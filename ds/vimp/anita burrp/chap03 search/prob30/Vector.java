//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob30\Vector.java

package chap03.prob30;

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

  public Object remove(int i) {
    // Removes the element at index i, shifting all the elements
    // that follow it back one position. Returns the removed object.
    if (i<0 || i>=size) throw new IndexOutOfBoundsException();
    Object x = objects[i];
    --size;
    System.arraycopy(objects, i+1, objects, i, size-i);
    objects[size] = null;
    return x;
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
        System.out.println("v.remove(2): " + v.remove(2));
        System.out.println("v: " + v);
    }
}

/*  Output:
v: (CA,US,MX,AR,BR,CH)
v.remove(2): MX
v: (CA,US,AR,BR,CH)
*/
