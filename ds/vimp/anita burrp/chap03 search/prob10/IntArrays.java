//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob10\IntArrays.java

package chap03.prob10;

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

  public static int[] permutation(int n) {
    // returns a new array of length n whose elements are the n
    // nonnegative integers that are less than n, in random order;
    int[] a = new int[n];
    for (int i=0; i<n; i++)
      a[i] = i;
    for (int i=0; i<n; i++)
      swap(a, i, random.nextInt(n));
    return a;
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

    public static int[] reverse(int[] a) {
        // returns a new array with the elements of a[] in reverse order;        int[] aa = new int[n];
        int n = a.length;
        int[] aa = new int[n];
        for (int i=0; i<n; i++)
            aa[i] = a[n-i-1];
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

    public static void main(String[] args) {
        print(permutation(8));
        print(permutation(8));
        print(permutation(8));
        print(permutation(8));
    }
}

/* Output:
{0,6,1,7,3,4,5,2}
{0,7,6,4,1,2,5,3}
{7,4,1,5,2,6,0,3}
{4,5,0,2,3,6,1,7}
*/

