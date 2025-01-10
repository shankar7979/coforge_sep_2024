/*
 * Main.java
 *
 * Created on September 13, 2002, 8:25 AM
 */

package chap03.prob40;

import chap03.list16.Map;
//import chap03.list17.ArrayMap;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private int lines, words, chars;
  private Map map = new ArrayMap();
  
  public Main(String file) {
    try {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String line = in.readLine(), word;
      while(line!=null) {
        ++lines;
        StringTokenizer parser = new StringTokenizer(line," .,:;-");
        while (parser.hasMoreTokens()) {
          word = parser.nextToken().toUpperCase();
          String list = map.get(word);
          if (list==null) map.put(word,""+lines);
          else map.put(word,list+","+lines);
          ++words;
        }
        System.out.println(lines + ":\t" + line);
        chars += line.length();
        line = in.readLine();
      }
      in.close();
    } catch(IOException e) { System.out.println(e); }
    System.out.println("lines: " + lines);
    System.out.println("words: " + words);
    System.out.println("chars: " + chars);
    System.out.println("distinct words: " + map.size());
    System.out.println(map);
  }
  
  public static void main(String[] args) {
    new Main(args[0]);
  }
}
