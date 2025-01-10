//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list01\Main.java

package chap03.list01;

public class Main {
    private static java.util.Random random = new java.util.Random();

    public static void main(String[] args) {
        int[] a = randomInts(10,1000);
        int[] aa = (int[])a.clone();  // creates a duplicate of a in aa
        print(a);
        print(aa);
        a[0] = a[1] = a[2] = 888;
        print(a);
        print(aa);
    }
    
    public static int[] randomInts(int n, int range) {
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = random.nextInt(range);
        return a;
    }
    
    public static void print(int[] a) {
        System.out.print("{"+a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
        System.out.println("}");
    }
    
}

/* Output:
{102,955,717,249,649,596,131,414,849,759}
{102,955,717,249,649,596,131,414,849,759}
{888,888,888,249,649,596,131,414,849,759}
{102,955,717,249,649,596,131,414,849,759}
*/
