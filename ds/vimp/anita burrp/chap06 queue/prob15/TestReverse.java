//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob15\TestReverse.java

package chap06.prob15;
import chap06.list01.Queue;

public class TestReverse {
  public static void main(String[] args) {
    LinkedQueue kids = new LinkedQueue();
    kids.add("Sara");
    kids.add("John");
    kids.add("Andy");
    System.out.println(kids);
    kids.reverse();
    System.out.println(kids);
  }
}

/*  Output
Sara John Andy 
Andy John Sara 
*/
