/*
 * Main.java
 *
 * Created on September 7, 2002, 7:03 PM
 */

package chap03.proj04;

import java.util.Random;

/**
 *
 * @author  Administrator
 */
public class Main {
    private Random random = new Random();
    String[] adjectives = new String[16];
    String[] nouns = new String[16];
    String[] verbs = new String[16];
    String[] adverbs = new String[16];
    
    /** Creates a new instance of Main */
    public Main(int p, int s) {
        System.out.println("p:\t" + p + ",\ts:\t" + s);
        int n=0;    
        try {
            BufferedReader adjectives = new BufferedReader(new FileReader("Adjectives.txt"));
            String line = adjectives.readLine();
            for (int i=0; line!=null; i++) {
                System.out.println(++n + ":\t" + line);
                adjectives[i] = line;
                line = adjectives.readLine();
            }
            adjectives.close();
            BufferedReader nouns = new BufferedReader(new FileReader("Nouns.txt"));
            BufferedReader verbs = new BufferedReader(new FileReader("Verbs.txt"));
            BufferedReader adverbs = new BufferedReader(new FileReader("Adverbs.txt"));
        } catch(IOException e) {}
      
        for (int i=0; i<p; i++)
            System.out.println(new Paragraph(s,random));
    }

//    private void load(
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numP=4, maxNumS=6;
        if (args.length==2) {
            numP = Integer.parseInt(args[0]);
            maxNumS = Integer.parseInt(args[1]);
        }
        new Main(numP,maxNumS);
    }
    
}
