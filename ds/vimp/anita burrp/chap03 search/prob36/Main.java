//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob36\Main.java

package chap03.prob36;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public Main(String file) {
    int words = 0, chars = 0;
    try {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String line = in.readLine();
      while(line!=null) {
        StringTokenizer parser = new StringTokenizer(line," ,:;-.?!");
        while (parser.hasMoreTokens()) {
          ++words;
          String word = parser.nextToken().toUpperCase();
          chars += word.length();
        }
        line = in.readLine();
      }
      in.close();
    } catch(IOException e) { System.out.println(e); }
    System.out.println("words: " + words);
    System.out.println("characters: " + chars);
  }

  public static void main(String[] args) {
    new Main(args[0]);
  }
}

/*  Output:
words: 268
characters: 1101
*/
