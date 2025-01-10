//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob24\Vector.java

package chap03.prob24;

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

  public int indexOf(Object x) {
    // Returns the smallest index of any component of this vector 
    // that equals(x). If not found, -1 is returned.
    for (int i=0; i<size; i++)
      if (objects[i].equals(x)) return i;
    return -1;
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
        System.out.println("v.indexOf(\"MX\"): " + v.indexOf("MX"));
        System.out.println("v.indexOf(\"FR\"): " + v.indexOf("FR"));
    }
}

/*  Output:
v: (CA,US,MX,AR,BR,CH)
v.indexOf("MX"): 2
v.indexOf("FR"): -1
*/
