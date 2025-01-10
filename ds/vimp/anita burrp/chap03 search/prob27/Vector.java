//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob27\Vector.java

package chap03.prob27;

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

public boolean add(Object x) {
  // Appends x to the end of this vector and returns true.
  if (size == objects.length) resize();
  objects[size++] = x;
  return true;
}

public Object get(int i) {
  // Returns the element at index i in this vector.
  return objects[i];
}

public void set(int i, Object x) {
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
        System.out.println("v.get(3): " + v.get(3));
        v.set(3, "CO");
        System.out.println("v: " + v);
        v.add("VE");
        System.out.println("v: " + v);
    }
}

/*  Output:
v: (CA,US,MX,AR,BR,CH)
v.get(3): AR
v: (CA,US,MX,CO,BR,CH)
v: (CA,US,MX,CO,BR,CH,VE)
*/
