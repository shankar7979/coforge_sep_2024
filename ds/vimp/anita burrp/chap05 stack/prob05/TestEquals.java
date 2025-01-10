//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob05\TestEquals.java

package chap05.prob05;

public class TestEquals {
  public static void main(String[] args) {
    ArrayStack stack1 = new ArrayStack(4);
    ArrayStack stack2 = new ArrayStack(4);
    stack1.push("A");
    stack2.push("A");
    stack1.push("B");
    stack2.push("B");
    stack1.push("C");
    stack2.push("C");
    System.out.println("stack1.equals(stack1): " + stack1.equals(stack1));
    System.out.println("stack1.equals(stack2): " + stack1.equals(stack2));
    stack2.push("D");
    System.out.println("stack1.equals(stack2): " + stack1.equals(stack2));
  }
}

/*  Output:
stack1.equals(stack1): true
stack1.equals(stack2): true
stack1.equals(stack2): false
*/
