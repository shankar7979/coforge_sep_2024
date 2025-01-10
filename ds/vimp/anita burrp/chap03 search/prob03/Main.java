//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob03\Main.java

package chap03.prob03;

public class Main {
    private java.util.Random random = new java.util.Random();
    private final int TESTS = 5;

    public Main(int n) {
        for (int i=0; i<TESTS; i++)
            System.out.println(letters(n));
    }
    
  private String letters(int n) {
  // Returns: an object s of type String; 
  // Postconditions: s.length() == n;
  //                 each character of s is a calital letter;
    StringBuffer buf = new StringBuffer(n);
    for (int i=0; i<n; i++) {
      int j = random.nextInt(26);
      char ch = (char)('A'+j);
      buf.append(ch);
    }
    return buf.toString();
  }
    
    void swap(int[] a, int i, int j) {
        int ai=a[i], aj=a[j];
        if (ai==aj) return;
        a[i] = aj;
        a[j] = ai;
    }

    private void print(int[] a) {
        System.out.print("{"+a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Main(Integer.parseInt(args[0]));
    }
}

/*  Output:
EMRNNUJKGO
NTDJVKWJQQ
FTQYXOCSKW
TBICBTJBFA
CGPZHAYVOT
*/