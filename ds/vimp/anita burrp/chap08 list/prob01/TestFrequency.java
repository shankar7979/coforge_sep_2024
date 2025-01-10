//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob01\TestFrequency.java

package chap08.prob01;

import java.util.*;

public class TestFrequency {
  public TestFrequency() {
    String[] countries = {"AT","DE","ES","FR","DE","ES","DE"};
    List list = Arrays.asList(countries);
    System.out.println("frequency(list, \"DE\"): " + frequency(list,"DE"));
  }

  int frequency(List list, Object object) {
  // returns the number of occurrences of object in list
    int f = 0;
    for (Iterator it = list.iterator(); it.hasNext(); )
      if (it.next().equals(object)) ++f;
    return f;
  }

  public static void main(String[] args) {
    new TestFrequency();
  }
}

/*  Output:
frequency(list, "DE"): 3
*/
