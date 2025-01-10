//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob09\IntArrays.java

package chap03.prob09;

public class IntArrays {
    private static java.util.Random random = new java.util.Random();

    /**
     * Determines whether the specified array is in ascending order.
     * 
     * @param  a the array.
     * @return true if a[] is in ascending order, otherwise false.
     */
    public static boolean isSorted(int[] a) {
        for (int i=1; i<a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }

    /**
     * Prints all the elements in the specified array.
     * 
     * @param  a the array.
     */
    public static void print(int[] a) {
        System.out.print("{"+a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
        System.out.println("}");
    }

    /**
     * Returns a new array of n random integers. If range>0, then
     * the elements will be uniformly distributed in the range
     * 0 <= a[i] < range; otherwise, they will range over all int
     * values.
     * 
     * @param  n the length of the new array.
     * @param  range determines the range of the element values.
     * @throws IllegalArgumentException.
     * @return the new array.
     */
    public static int[] randomInts(int n, int range) {
        int[] a = new int[n];
        if (n<2) throw new IllegalArgumentException();
        for (int i=0; i<n; i++)
            a[i] = random.nextInt(range);
        return a;
    }

    /**
     * Returns a new array of size n that contains the elements of
     * the specified array a and 0s thereafter.
     * 
     * @param  a the array to be copied.
     * @param  n the length of the new array.
     * @throws IllegalArgumentException.
     * @return the new array.
     */
    public static int[] resize(int[] a, int n) {
        if (n < a.length) throw new IllegalArgumentException();
        int[] aa = new int[n];
        System.arraycopy(a, 0, aa, 0, a.length);
        return aa;
    }

    /**
     * Interchanges element i with element j in the specified array.
     * 
     * @param  a the array.
     * @param  i index of one element.
     * @param  j index of the other element.
     */
     public static void swap(int[] a, int i, int j) {
        int ai = a[i], aj = a[j];
        if (ai==aj) return;
        a[i] = aj;
        a[j] = ai;
    }

  public static int[] uniqueRandomInts(int n, int range) {
    // returns a new array of length n with unique nonnegative random
    // integers that are less than the specified range;
    if (n > range) throw new IllegalArgumentException();
    int[] a = new int[n];
    for (int i=0; i<n; i++) {  // insert a unique integer:
      next:
        for (;;) {  // repeat until another unique one is found
          int x = random.nextInt(range);
          for (int j=0; j<i; j++) {
            if (a[j] == x)   // a[i] is not unique
              continue next;  // try again
          }
          a[i] = x;  // insert it
          break;  // a[i] is unique among {a[0]..a[i-1]}
        }
    }
    return a;
  }

    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        print(uniqueRandomInts(8, 100));
        print(uniqueRandomInts(8, 10));
        print(uniqueRandomInts(8, 8));
        print(uniqueRandomInts(8, 7));
    }
}

/* Output:
{95,17,75,32,48,97,19,3}
{6,9,7,5,4,8,1,3}
{5,6,3,0,4,7,1,2}
java.lang.IllegalArgumentException
        int[] chap03.prob09.IntArrays.uniqueRandomInts(int, int)
                IntArrays.java:87
        void chap03.prob09.IntArrays.main(java.lang.String[])
                IntArrays.java:107
Exception in thread main
*/

