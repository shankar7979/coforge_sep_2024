//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list03\TestSwap.java

package chap03.list03;

import chap03.list08.IntArrays;

public class TestSwap {
        
    public TestSwap() {
        int[] a = {22,33,44,55,66,77,88};
        IntArrays.print(a);
        swap(a, 3, 5);
        IntArrays.print(a);
    }
    
    public static void main(String[] args) {
        new TestSwap();
    }
    
    void swap(int[] a, int i, int j) {
        int ai = a[i], aj = a[j];
        if (ai == aj) return;
        a[i] = aj;
        a[j] = ai;
    }
}

/*  Output:
{22,33,44,55,66,77,88}
{22,33,44,77,66,55,88}
*/
