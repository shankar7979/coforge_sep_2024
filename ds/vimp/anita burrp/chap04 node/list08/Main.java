//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list08\Main.java

package chap04.list08;

public class Main {
    public Main() {
        int[] a = {22, 33, 44, 55, 66};
        print(a, 5);

    }

    void print(int[] a, int n) {
        for (int i=0; i < n; i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*  Output:
22
33
44
55
66
*/
