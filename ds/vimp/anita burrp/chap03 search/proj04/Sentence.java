/*
 * Sentence.java
 *
 * Created on September 7, 2002, 7:08 PM
 */

package chap03.proj04;

import java.util.Random;

/**
 *
 * @author  Administrator
 */
public class Sentence {
    private Random random = new Random();
    private String adjective1;
    private String noun1;
    private String verb;
    private String adjective2;
    private String noun2;
    private String adverb;

    public Sentence(Random random) {
        this.random = random;
    }

    public Sentence(String a1, String n1, String v,
                    String a2, String n2, String a ) {
        adjective1 = a1;
        noun1 = n1;
        verb = v;
        adjective2 = a2;
        noun2 = n2;
        adverb = a;
    }

    public static Sentence next() {
        return null;
    }

    public String toString() {
        return "My " + adjective1 + " "  + noun1 + " "  + verb + " " 
                     + adjective2 + " "  + noun2 + " rather "  + adverb + ".";
    }
}
