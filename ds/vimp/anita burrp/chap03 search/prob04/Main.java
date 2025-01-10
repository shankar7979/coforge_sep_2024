//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob04\Main.java

package chap03.prob04;

public class Main {
    private java.util.Random random = new java.util.Random();
    private final int TESTS = 5;

    public Main(int n) {
        for (int i=0; i<TESTS; i++)
        print(permutation(n));
    }
    
  private int[] permutation(int n) {
  // Returns: an array a[] of type int[]; 
  // Postconditions: a.length == n;
  //                 0 <= a[i] < n, for all i;
  //                 all n elements of a[] are different; 
    int[] a = new int[n];
    for (int i=0; i<n; i++)
      a[i] = i;
    for (int i=0; i<n; i++)
      swap(a,i,random.nextInt(n));
    return a;
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
{7,1,0,4,2,5,8,3,9,6}
{3,0,6,5,2,9,8,4,1,7}
{6,5,2,4,8,3,0,1,9,7}
{8,1,3,6,5,4,2,7,0,9}
{7,1,0,3,6,2,4,8,9,5}
*/