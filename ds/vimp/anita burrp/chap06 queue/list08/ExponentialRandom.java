//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap06\list08\ExponentialRandom.java

package chap06.list08;

public class ExponentialRandom extends java.util.Random {
  private double mean;

  public ExponentialRandom(double mean) {
    super(System.currentTimeMillis());
    this.mean = mean;
  }

  public double nextDouble() {
    return -mean*Math.log(1.0-super.nextDouble());
  }
  
  public int nextInt() {
    return (int)Math.ceil(nextDouble());
  }    
}
