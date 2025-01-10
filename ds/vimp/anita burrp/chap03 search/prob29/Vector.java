//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob29\Vector.java

package chap03.prob29;

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

  public void add(int i, Object x) {
    // Inserts x at index i, shifting all the elements from that
    // position to the end forward one position.
    if (i<0 || i>size) throw new IndexOutOfBoundsException();
    System.arraycopy(objects, i, objects, i+1, size-i);
    objects[i] = x;
    ++size;
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
        v.add(2, "VE");
        System.out.println("v: " + v);
    }
}

/*  Output:
v: (CA,US,MX,AR,BR,CH)
v: (CA,US,VE,MX,AR,BR,CH)
*/
