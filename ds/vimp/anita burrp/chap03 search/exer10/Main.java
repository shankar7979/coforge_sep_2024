//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\exer10\Main.java

package chap03.exer10;

public class Main {
    public static void main(String[] args) {
        int[] x = {22,33,11};
        System.out.println(x);
        int[] y = {22,33,11};
        System.out.println(y);
        boolean eqeq = (x == y);
        System.out.println("eqeq = " + eqeq);
        boolean dotEq = java.util.Arrays.equals(x,y);
        System.out.println("dotEq = " + dotEq);
        y = x;
        System.out.println(y);
        eqeq = (x == y);
        System.out.println("eqeq = " + eqeq);
    }
}

/*  Output:
[I@1
[I@2
eqeq = false
dotEq = true
[I@1
eqeq = true
*/
