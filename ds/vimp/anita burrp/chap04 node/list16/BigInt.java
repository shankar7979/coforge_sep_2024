//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\list16\BigInt.java

package chap04.list16;

public class BigInt {

  private Node start;

  public BigInt plus(BigInt y) {
    Node p=start, q=y.start;
    int n = p.digit + q.digit;
    BigInt z = new BigInt(n%10);
    p = p.next;
    q = q.next;
    Node r=z.start;
    while (p!=null && q!=null) {
      n = n/10 + p.digit + q.digit;
      r.next = new Node(n%10);
      p = p.next;
      q = q.next;
      r = r.next;
    }
    while (p!=null) {
      n = n/10 + p.digit;
      r.next = new Node(n%10);
      p = p.next;
      r = r.next;
    }
    while (q!=null) {
      n = n/10 + q.digit;
      r.next = new Node(n%10);
      q = q.next;
      r = r.next;
    }
    if (n>9) r.next = new Node(n/10);
    return z;
  }

  public BigInt(int n) {
    if (n<0) throw new IllegalArgumentException(n+"<0");
    start = new Node(n%10);
    Node p=start;
    n /= 10;
    while (n>0) {
      p = p.next = new Node(n%10);
      n /= 10;
    }
  }

  public BigInt(String s) {
    if (s.length()==0) throw new IllegalArgumentException("empty string");
    start = new Node(digit(s,s.length()-1));
    Node p=start;
    for (int i=s.length()-2; i>=0; i--)
      p = p.next = new Node(digit(s,i));
  }

  private int digit(String s, int i) {
    String ss=s.substring(i,i+1);
    return Integer.parseInt(ss);
  }

  public String toString() {
    StringBuffer buf = new StringBuffer(Integer.toString(start.digit));
    Node p=start.next;
    while (p!=null) {
      buf.insert(0,Integer.toString(p.digit));
      p = p.next;
    }
    return buf.toString();
  }

  private class Node {
    int digit;
    Node next;
    Node(int digit) { this.digit = digit; }
  }
}
