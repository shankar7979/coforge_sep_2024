//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\list07\SimClient.java

package chap06.list07;

import chap06.list04.Server;
import chap06.list05.Client;

public class SimClient implements Client {
  int id, arrivalTime=-1, startTime=-1, stopTime=-1;

  public SimClient(int id, int t) {
    this.id = id;
    arrivalTime = t;
    System.out.println(this + " arrived at time " + t);
  }

  public int getStartTime() {
    return startTime;
  }

  public int getStopTime() {
    return stopTime;
  }

  public void setStartTime(int t) {
    startTime = t;
  }

  public void setStopTime(int t) {
    stopTime = t;
  }

  public String toString() {
    return "Client " + id;
  }
}
