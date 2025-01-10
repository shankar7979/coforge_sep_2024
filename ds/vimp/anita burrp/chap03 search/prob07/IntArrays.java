//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob07\IntArrays.java

package chap03.prob07;

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

  public static int[] truncate(int[] a, int n) {
    // returns a new array with the first n elements of a[];
    if (n > a.length) throw new IllegalArgumentException();
    int[] aa = new int[n];
    System.arraycopy(a, 0, aa, 0, n);
    return aa;
  }        

    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        print(a);
        print(truncate(a, 4));
        print(a);
    }
}

/* Output:
{22,33,44,55,66,77,88,99}
{22,33,44,55}
{22,33,44,55,66,77,88,99}
*/

