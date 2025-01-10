//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list10\Main.java

package chap08.list10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new LinkedList();
        for (int i=0; i<args.length; i++) {
            int n = Integer.parseInt(args[i]);
            System.out.print(n + "\t");
            list.add(new Integer(n));
        }
        System.out.println();
        int sum = 0;
        for (Iterator it=list.iterator(); it.hasNext(); ) {
            Integer x = (Integer)it.next();
            sum += x.intValue();
            System.out.print(sum + "\t");
        }
        System.out.println();
    }
}

/*  Output:
11      22      33      44      55      66      
11      33      66      110     165     231     
*/