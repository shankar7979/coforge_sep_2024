//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list03\TestListIterator.java

package chap08.list03;

import java.util.*;

public class TestListIterator {
  public static void main(String[] args) {
    String[] countries = {"AT","DE","ES","FR"};
    List list = Arrays.asList(countries);
    System.out.println("list: " + list);
    ListIterator it = list.listIterator();
    System.out.println("it.nextIndex(): " + it.nextIndex());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.nextIndex(): " + it.nextIndex());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.nextIndex(): " + it.nextIndex());
    System.out.println("it.next(): " + it.next());
    System.out.println("it.previousIndex(): " + it.previousIndex());
    System.out.println("it.previous(): " + it.previous());
    System.out.println("it.previousIndex(): " + it.previousIndex());
    System.out.println("it.previous(): " + it.previous());
  }
}

/*  Output:
list: [AT, DE, ES, FR]
it.nextIndex(): 0
it.next(): AT
it.nextIndex(): 1
it.next(): DE
it.nextIndex(): 2
it.next(): ES
it.previousIndex(): 2
it.previous(): ES
it.previousIndex(): 1
it.previous(): DE
*/