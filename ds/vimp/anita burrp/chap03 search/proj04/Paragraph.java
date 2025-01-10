/*
 * Paragraph.java
 *
 * Created on September 7, 2002, 7:15 PM
 */

package chap03.proj04;

import java.util.*;

/**
 *
 * @author  Administrator
 */
public class Paragraph {
    private Random random;
    private Sentence[] sentences;
    private int n;  // the actual number of sentences
    
    /** Creates a new instance of Paragraph */
    public Paragraph(int maxNumSentences, Random random) {
        this.random = random;
        this.sentences = new Sentence[maxNumSentences];
        this.n = random.nextInt(maxNumSentences);
        for (int i=0; i<n; i++)
            sentences[i] = new Sentence(random);
    }

    public String toString() {
        StringBuffer buf = new StringBuffer("\t" + sentences[0]);
        for (int i=0; i<n; i++)
            buf.append(" " + sentences[i]);
        return buf.toString();
    }
}
