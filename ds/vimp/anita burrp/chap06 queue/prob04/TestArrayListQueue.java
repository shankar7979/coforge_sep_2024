//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob04\TestArrayListQueue.java

package chap06.prob04;

import chap06.list01.Queue;

public class TestArrayListQueue {
  public static void main(String[] args) {
    Queue kids = new ArrayListQueue(2);
    kids.add("Sara");
    kids.add("John");
    kids.add("Andy");
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
    System.out.println("kids.remove(): " + kids.remove());
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
    kids.add("Mike");
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
    System.out.println("kids.remove(): " + kids.remove());
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
    System.out.println("kids.remove(): " + kids.remove());
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
    System.out.println("kids.remove(): " + kids.remove());
    System.out.println("kids.size(): " + kids.size());
    System.out.println("kids.first(): " + kids.first());
  }
}

/*  Output
kids.size(): 3
kids.first(): Sara
kids.remove(): Sara
kids.size(): 2
kids.first(): John
kids.size(): 3
kids.first(): John
kids.remove(): John
kids.size(): 2
kids.first(): Andy
kids.remove(): Andy
kids.size(): 1
kids.first(): Mike
kids.remove(): Mike
kids.size(): 0
java.lang.IllegalStateException: queue is empty
        java.lang.Object chap06.prob04.ArrayListQueue.first()
                ArrayListQueue.java:23
        void chap06.prob04.TestArrayListQueue.main(java.lang.String[])
                TestArrayListQueue.java:32
Exception in thread main
*/
