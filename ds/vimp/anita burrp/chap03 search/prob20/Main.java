//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob20\Main.java

package chap03.prob20;

public class Main {
  public static void main(String[] args) {
    int len = 1, count = 0;
    while (count<args.length) {
      for (int j=0; j<args.length; j++) {
        if (args[j].length() == len) {
          System.out.println(args[j]);
          ++count;
        }
      }
      ++len;
    }
  }
}

/*  Output:
Sol
Luna
Venus
Earth
Pluto
Saturn
Uranus
Mercury
Jupiter
Neptune
*/
