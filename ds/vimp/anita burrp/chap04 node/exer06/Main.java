//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\exer06\Main.java

package chap04.exer06;

public class Main {
  public static void main(String[] args){
     int[] vals = {0,11,22,33,44,55,66};
     Node p = new Node(66,null) ;
     System.out.println( "node#6: " + p.details() ) ;
     for (int ndx=5 ; ndx>=0 ; ndx--){
       p = new Node(vals[ndx],p);
       System.out.println( "node#" + ndx + ": " + p.details() ) ;
     }
   }
}          // end class Main

class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data ;
    this.next = next ;
  }
  String address(Node p){
    if ( p==null ) return "null";
    String pAdrs = ""+p ; // uses Object toString() method
    return pAdrs.substring(pAdrs.indexOf('@')); // @address
  }
  String details(){
    return address(this) + ", data="+data + ", next="+address(next);
  }
}               // end class Node

/*  Output:
node#6: @1, data=66, next=null
node#5: @2, data=55, next=@1
node#4: @3, data=44, next=@2
node#3: @4, data=33, next=@3
node#2: @5, data=22, next=@4
node#1: @6, data=11, next=@5
node#0: @7, data=0, next=@6
*/
