//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob01\TestArrayQueue.java

package chap06.prob01;

import chap06.list01.Queue;
import chap06.prob01.ArrayQueue;

public class TestArrayQueue {
  public static void main(String[] args) {
    Queue kids = new ArrayQueue(2);
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
        java.lang.Object chap06.prob01.ArrayQueue.first()
                ArrayQueue.java:24
        void chap06.prob01.TestArrayQueue.main(java.lang.String[])
                TestArrayQueue.java:33
Exception in thread main
*/
