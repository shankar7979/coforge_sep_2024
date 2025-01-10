//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\exer04\Main.java

package chap04.exer04;

public class Main {
  public static void main(String[] args){
     int[] vals = {44,55,33,11,22,33,77};
     Node n = null ;
     for ( int i =  0; i < vals.length; i++){
       Node p = new Node(vals[i],n);
       n = p ;
       show( n ) ;
     }
   }
  public static void show( Node p ){
    if ( p == null ) return ;
    System.out.print( p.data ) ;
    for ( p = p.next ; p != null ; p = p.next )
      System.out.print( "->" + p.data   );
    System.out.println() ;
  }
}          // end class Main

class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data ;
    this.next = next ;
  }
}               // end class Node

/*  Output:
44
55->44
33->55->44
11->33->55->44
22->11->33->55->44
33->22->11->33->55->44
77->33->22->11->33->55->44
*/
