//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\prob17\TestLastElement.java

package chap06.prob17;
import chap06.list01.Queue;
import chap06.list02.LinkedQueue;

public class TestLastElement {
  public static void main(String[] args) {
    Queue queue = new LinkedQueue();
    queue.add("A");
    queue.add("B");
    queue.add("C");
    queue.add("D");
    queue.add("E");
    System.out.println(queue);
    System.out.println("lastElement(queue): " + lastElement(queue));
    System.out.println(queue);
  }
  
  public static Object lastElement(Queue queue) {
    Queue aux = new LinkedQueue();
    while (queue.size() > 1)
      aux.add(queue.remove());
    Object last = queue.remove();
    while (aux.size() > 0)
      queue.add(aux.remove());
    return last;
  }    
}

/*  Output
A B C D E 
lastElement(queue): E
E E E E 
*/
