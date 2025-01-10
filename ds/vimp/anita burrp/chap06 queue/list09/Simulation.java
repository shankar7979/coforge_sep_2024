//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\list09\Simulation.java

package chap06.list09;

import chap06.list01.Queue;
import chap06.list02.LinkedQueue;
import chap06.list04.Server;
import chap06.list05.Client;
import chap06.list06.SimServer;
import chap06.list07.SimClient;
import chap06.list08.ExponentialRandom;

public class Simulation {
  static int numServers;
  static int numClients;
  static int meanServiceTime;
  static int meanInterarrivalTime;
  static Server[] servers;
  static Client[] clients;
  static Queue queue = new LinkedQueue();
  static java.util.Random randomArrival;
  static java.util.Random randomService;

  public static void main(String[] args) {
    init(args);
    //  See Listing 6.3 on page 173
  }  

  static void init(String[] args) {
    if (args.length<4) {
      System.out.println("Usage: java Simulation <numServers> "
      + "<numClients> <meanServiceTime> <meanInterarrivalTime>");
      System.out.println(" e.g.: java Simulation 3 100 12 4");
      System.exit(0);
    }
    numServers = Integer.parseInt(args[0]);
    numClients = Integer.parseInt(args[1]);
    meanServiceTime = Integer.parseInt(args[2]);
    meanInterarrivalTime = Integer.parseInt(args[3]);
    servers = new Server[numServers];
    clients = new Client[numClients];
    randomService = new ExponentialRandom(meanServiceTime);
    randomArrival = new ExponentialRandom(meanInterarrivalTime);
    queue = new LinkedQueue();
    for (int j=0; j<numServers; j++)
      servers[j] = new SimServer(j,randomService.nextInt());
    System.out.println("     Number of servers = " + numServers); 
    System.out.println("     Number of clients = " + numClients); 
    System.out.println("     Mean service time = " + meanServiceTime); 
    System.out.println("Mean interarrival time = "
    + meanInterarrivalTime); 
    for (int j=0; j<numServers; j++)
      System.out.println("Mean service time for " + servers[j]
        + " = "+ servers[j].getMeanServiceTime());    
  }
}

/*  Output:
     Number of servers = 3
     Number of clients = 100
     Mean service time = 12
Mean interarrival time = 2
Mean service time for Server A = 21
Mean service time for Server B = 6
Mean service time for Server C = 8
*/
