//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list02\Main.java

package chap04.list02;

import chap03.list08.IntArrays;

public class Main {
    public Main() {
        int[] a = {0,44,0,22,55,33,66,0};
        int[] k = {3,4,0,5,6,1,0,0};
        IntArrays.print(a);
        IntArrays.print(k);
        orderedPrint(a,k);
        insert(a,k,50,7);
        IntArrays.print(a);
        IntArrays.print(k);
        orderedPrint(a,k);
    }

    void insert(int[] a, int[] k, int x, int free) {
        int i=0;
        while (k[i]!=0 && a[k[i]]<x)
            i = k[i];
        a[free] = x;
        k[free] = k[i];
        k[i] = free++;
    }

    void orderedPrint(int[] a, int[] k) {
        for (int i=0; k[i]!=0; i = k[i])
            System.out.print(a[k[i]] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*  Output:
{0,44,0,22,55,33,66,0}
{3,4,0,5,6,1,0,0}
22 33 44 55 66 
{0,44,0,22,55,33,66,50}
{3,7,0,5,6,1,0,4}
22 33 44 50 55 66
*/
