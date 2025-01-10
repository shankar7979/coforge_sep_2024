//  Eliza.java

package chap08.proj08;

import java.io.*;
import java.util.*;

public class Eliza {
  final String RESPONSES="chap08\\proj08\\Responses.txt";
  ArrayList keys, responses;
  Random random = new Random();

  Eliza() {
    try {
      loadData();
      Reader reader = new InputStreamReader(System.in);
      BufferedReader input = new BufferedReader(reader);
      String lastKey="", key="", name=initiateDialogue(input);
      while (true) {
        System.out.print(name + ": ");
        lastKey=key;
        key = getKey(input.readLine());
        if (key.equals(lastKey)) key = randomElement(keys);
        if (key=="") System.out.println("\n" + randomElement(responses));
        else System.out.println("\nEliza: Tell me more about your " + key + ".");
      }
    } catch (IOException e) { e.printStackTrace(); }        
  }

  String getKey(String string) {
    // Searches the string for a noun modified by "my".
    // If found, it is added to the keys list and returned;
    // otherwise, "" is returned. 
    StringTokenizer tok = new StringTokenizer(string," .,;'");
    while (tok.hasMoreTokens())
      if (tok.nextToken().toLowerCase().equals("my")) {
        String word=tok.nextToken().toLowerCase();
        keys.add(word);
        return word; 
      }
    return "";
  }

  String initiateDialogue(BufferedReader input) throws IOException {
    System.out.println("\nHello. My name is Eliza.\n\nEliza: What's your name?");
    System.out.print("You: ");
    String name = input.readLine(), key="";
    System.out.println("\nEliza: Is anything bothering you, " + name + "?");
    return name;
  }

  void loadData() throws IOException {
    keys = new ArrayList();
    BufferedReader in = new BufferedReader(new FileReader(RESPONSES));
    responses = new ArrayList();
    for (String line=in.readLine(); line!=null; line=in.readLine())
      responses.add(line);
  }
  
  String randomElement(ArrayList list) {
    int n=list.size();
    if (n>0) return (String)list.get(random.nextInt(n));
    return "";
  }
  
  public static void main(String[] args) {
    new Eliza();
    System.out.println("\n\n" + new java.util.Date());
  }
}
