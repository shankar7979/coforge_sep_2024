//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list04\TestListIterator.java

package chap08.list04;

import java.util.*;

public class TestListIterator {
  public static void main(String[] args) {
    String[] countries = {"AT","DE","ES","FR"};
    List list = Arrays.asList(countries);
    System.out.println("list: "+list);
    ListIterator it=list.listIterator();
    it.next();
    it.next();
    it.set("CZ");                   // change DE to CZ 
    System.out.println("list: "+list);
    System.out.println("countries[1]: "+countries[1]);
    countries[3] = "GB";            // change FR to GB 
    System.out.println("list: "+list);
  }
}

/*  Output:
list: [AT, DE, ES, FR]
list: [AT, CZ, ES, FR]
countries[1]: CZ
list: [AT, CZ, ES, GB]
*/