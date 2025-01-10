//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob02\TestSequence.java

package chap08.prob02;

import java.util.*;
import chap08.list08.Sequence;

public class TestSequence {
  public TestSequence() {
    String[] countries = {"CA","DE","FR","GB","IT","JP","RU","US"};
    Sequence g8 = new Sequence(Arrays.asList(countries));
    print(g8);
    g8.remove(6);
    print(g8);
  }

  void print(Sequence s) {
    for (Iterator it =  s.iterator(); it.hasNext(); )
      System.out.print(it.next() + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    new TestSequence();
  }
}

/*  Output:
CA DE FR GB IT JP RU US 
CA DE FR GB IT JP US 
*/
