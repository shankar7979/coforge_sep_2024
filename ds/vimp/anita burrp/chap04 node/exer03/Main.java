//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\exer03\Main.java

package chap04.exer03;

import chap04.list16.BigInt;

public class Main {
  public static void main(String[] args){
    BigInt x = new BigInt(0);
    BigInt y = new BigInt(1);
    BigInt z = new BigInt(1);
    for (int i=0; i<1001; i++) {
      x = y;
      y = z;
      z = x.plus(y);
      if (i>995)
        System.out.println((i+3) + "\t" + z);
    }
  }
}

/*  Output:
99
22->99
99->88
22->99->88
88
0->88
22->99->0->88
*/
