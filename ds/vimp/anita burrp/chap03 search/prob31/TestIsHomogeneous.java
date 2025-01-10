//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob31\TestPrint.java

package chap03.prob31;

public class TestIsHomogeneous {
    protected Object[] objects;       // backing array
    protected int size;               // actual number of Objects stored
    protected static final int CAPACITY=10;  // default array length

    public TestIsHomogeneous() {
        Object[] a = { new Integer(44),
                       new Integer(88),
                       null,
                       new Double(3.14159) };
        System.out.println("isHomogeneous(a): " + isHomogeneous(a));
        a = new String[]{"CA","US","MX","AR","BR","CH"};
        System.out.println("isHomogeneous(a): " + isHomogeneous(a));
    }

  public boolean isHomogeneous(Object[] a) {
    // Returns true iff every non-null element has the same type.
    int n=a.length;
    if (n<2) return true;
    if (a[0] == null) {
      for (int i=1; i<n; i++) {
        if (a[i] != null)
          return false;
      }
    } else {
      Class c = a[0].getClass();
      for (int i=1; i<n; i++) {
        if (a[i] == null || !a[i].getClass().equals(c))
          return false;
      }
    }
    return true;
  }

    public static void main(String[] args) {
        new TestIsHomogeneous();
    }
}

/*  Output:
isHomogeneous(a): false
isHomogeneous(a): true
*/
