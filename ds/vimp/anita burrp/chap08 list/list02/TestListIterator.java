//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list02\TestListIterator.java

package chap08.list02;

import java.util.*;

public class TestListIterator {
  public static void main(String[] args) {
    List list = Arrays.asList(new String[]{"AT", "DE", "ES", "FR"});
    System.out.println("list: "+list);
    ListIterator it=list.listIterator();
    System.out.println("it.next(): " + it.next());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.previous(): " + it.previous());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.previous(): " + it.previous());
    System.out.println("it.previous(): " + it.previous());
    System.out.println("it.hasPrevious(): " + it.hasPrevious());
    System.out.println("it.hasNext(): " + it.hasNext());
  }
}

/*  Output:
list: [AT, DE, ES, FR]
it.next(): AT
it.next(): DE
it.previous(): DE
it.next(): DE
it.next(): ES
it.previous(): ES
it.previous(): DE
it.hasPrevious(): true
it.hasNext(): true
*/