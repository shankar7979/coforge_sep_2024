//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\prob01\Main.java

package chap03.prob01;

public class Main {
  private java.util.Random random = new java.util.Random();

  public Main(int n) {
    double[] a = randomDoubles(n);
    double[] aa = (double[])a.clone();  // creates a duplicate of a in aa
    print(a);
    print(aa);
    a[0] = a[1] = a[2] = 0.888;
    print(a);
    print(aa);
  }

  private double[] randomDoubles(int n) {
    double[] a = new double[n];
    for (int i=0; i<n; i++)
      a[i] = random.nextDouble();
    return a;
  }

  private void print(double[] a) {
    printf(a[0], "{#.###");
    for (int i=1; i<a.length; i++)
      printf(a[i], "','#.###");
    System.out.println("}");
  }

  private void printf(double x, String fs) {
    System.out.print(new java.text.DecimalFormat(fs).format(x));
  }

  public static void main(String[] args) {
    new Main(Integer.parseInt(args[0]));
  }
}

/*  Output:
{0.402,0.192,0.045,0.288,0.533,0.32,0.06,0.481,0.609,0.662}
{0.402,0.192,0.045,0.288,0.533,0.32,0.06,0.481,0.609,0.662}
{0.888,0.888,0.888,0.288,0.533,0.32,0.06,0.481,0.609,0.662}
{0.402,0.192,0.045,0.288,0.533,0.32,0.06,0.481,0.609,0.662}
*/