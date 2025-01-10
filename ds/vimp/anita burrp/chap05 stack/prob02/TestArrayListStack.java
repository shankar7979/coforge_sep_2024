//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob02\TestArrayListStack.java

package chap05.prob02;

public class TestArrayListStack {
  public static void main(String[] args) {
    ArrayListStack crates = new ArrayListStack(4);
    crates.push("CARROTS");
    crates.push("ORANGES");
    crates.push("RAISINS");
    crates.push("PICKLES");
    crates.push("BANANAS");
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.peek(): " + crates.peek());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.peek(): " + crates.peek());
    crates.push("WALNUTS");
    crates.push("OYSTERS");
    System.out.println("crates.size(): " + crates.size()
                   + "\tcrates.peek(): " + crates.peek());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
    System.out.println("crates.pop(): " + crates.pop());
  }
}

/*  Output:
crates.size(): 5        crates.peek(): BANANAS
crates.pop(): BANANAS
crates.pop(): PICKLES
crates.pop(): RAISINS
crates.size(): 2        crates.peek(): ORANGES
crates.size(): 4        crates.peek(): OYSTERS
crates.pop(): OYSTERS
crates.pop(): WALNUTS
crates.pop(): ORANGES
crates.pop(): CARROTS
java.lang.IllegalStateException: stack is empty
        java.lang.Object chap05.prob02.ArrayListStack.pop()
                ArrayListStack.java:27
        void chap05.prob02.TestArrayListStack.main(java.lang.String[])
                TestArrayListStack.java:28
Exception in thread main
*/
