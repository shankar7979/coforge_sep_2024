//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap04\exer05\Main.java

package chap04.exer05;

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
     String prefix = "*";
     int k = 0 ;
     while( p != null ){
       System.out.println( prefix + "node#" + k + " data = " + p.data );
       prefix +=  "*" ;
       k++ ;
       p = p.next ;
     }
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
*node#0 data = 44
*node#0 data = 55
**node#1 data = 44
*node#0 data = 33
**node#1 data = 55
***node#2 data = 44
*node#0 data = 11
**node#1 data = 33
***node#2 data = 55
****node#3 data = 44
*node#0 data = 22
**node#1 data = 11
***node#2 data = 33
****node#3 data = 55
*****node#4 data = 44
*node#0 data = 33
**node#1 data = 22
***node#2 data = 11
****node#3 data = 33
*****node#4 data = 55
******node#5 data = 44
*node#0 data = 77
**node#1 data = 33
***node#2 data = 22
****node#3 data = 11
*****node#4 data = 33
******node#5 data = 55
*******node#6 data = 44
*/
