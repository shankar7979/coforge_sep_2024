//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\list04\Server.java

package chap06.list04;

import chap06.list05.Client;

public interface Server {
  public int getMeanServiceTime();
  public int getStopTime();
  public boolean isIdle();
  public void startServing(Client client, int t);
  public void stopServing(int t);
}
