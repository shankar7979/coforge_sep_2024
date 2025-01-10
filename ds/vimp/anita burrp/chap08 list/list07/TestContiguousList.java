//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list07\TestContiguousList.java

package chap08.list07;

import chap08.list06.ContiguousList;

public class TestContiguousList {
  public static void main(String[] args) {
    java.util.List g8 = new ContiguousList();
    g8.add("CA");            // Canada
    g8.add("DE");            // Germany
    g8.add("FR");            // France
    g8.add("GB");            // Great Britain
    g8.add("IT");            // Italy
    g8.add("RU");            // Russia
    g8.add("US");            // United States
    System.out.println(g8);
    g8.add(5,"JP");          // Japan
    System.out.println(g8);
    System.out.println("g8.size(): " + g8.size());
    System.out.println("g8.contains(\"JP\"): " + g8.contains("JP"));
    System.out.println("g8.contains(\"CN\"): " + g8.contains("CN"));
    System.out.println("g8.get(3): " + g8.get(3));
    System.out.println("g8.subList(3,6): " + g8.subList(3,6));
    g8.remove(6);
    System.out.println(g8);
    System.out.println("g8.set(0,\"CN\"): " + g8.set(0,"CN")); // China
    System.out.println(g8);
  }
}

/*  Output:
[CA, DE, FR, GB, IT, RU, US]
[CA, DE, FR, GB, IT, JP, RU, US]
g8.size(): 8
g8.contains("JP"): true
g8.contains("CN"): false
g8.get(3): GB
g8.subList(3,6): [GB, IT, JP]
[CA, DE, FR, GB, IT, JP, US]
g8.set(0,"CN"): CA
[CN, DE, FR, GB, IT, JP, US]
*/
