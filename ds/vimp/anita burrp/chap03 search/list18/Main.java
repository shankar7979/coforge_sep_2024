//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list18\Main.java

package chap03.list18;

import chap03.list16.Map;
import chap03.list19.ArrayMap;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  
  public Main(String file) {
    Map map = new ArrayMap();
    int lineNumber = 0;
    try {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String line = in.readLine();
      while(line!=null) {
        ++lineNumber;
        StringTokenizer parser = new StringTokenizer(line," ,:;-.?!");
        while (parser.hasMoreTokens()) {
          String word = parser.nextToken().toUpperCase();
          String list = map.get(word);
          if (list==null) map.put(word,""+lineNumber);
          else map.put(word,list+","+lineNumber);
        }
        System.out.println(lineNumber + ":\t" + line);
        line = in.readLine();
      }
      in.close();
    } catch(IOException e) { System.out.println(e); }
    System.out.println(map);
    System.out.println("lines: " + lineNumber);
    System.out.println("distinct words: " + map.size());
  }
  
  public static void main(String[] args) {
    new Main(args[0]);
  }
}

/*  Output:
1:      Friends, Romans, countrymen, lend me your ears;
2:      I come to bury Caesar, not to praise him.
3:      The evil that men do lives after them;
4:      The good is oft interred with their bones;
5:      So let it be with Caesar. The noble Brutus
6:      Hath told you Caesar was ambitious:
7:      If it were so, it was a grievous fault,
8:      And grievously hath Caesar answer'd it.
9:      Here, under leave of Brutus and the rest--
10:     For Brutus is an honourable man;
11:     So are they all, all honourable men--
12:     Come I to speak in Caesar's funeral.
13:     He was my friend, faithful and just to me:
14:     But Brutus says he was ambitious;
15:     And Brutus is an honourable man.
16:     He hath brought many captives home to Rome
17:     Whose ransoms did the general coffers fill:
18:     Did this in Caesar seem ambitious?
19:     When that the poor have cried, Caesar hath wept:
20:     Ambition should be made of sterner stuff:
21:     Yet Brutus says he was ambitious;
22:     And Brutus is an honourable man.
23:     You all did see that on the Lupercal
24:     I thrice presented him a kingly crown,
25:     Which he did thrice refuse: was this ambition?
26:     Yet Brutus says he was ambitious;
27:     And, sure, he is an honourable man.
28:     I speak not to disprove what Brutus spoke,
29:     But here I am to speak what I do know.
30:     You all did love him once, not without cause:
31:     What cause withholds you then, to mourn for him?
32:     O judgment! thou art fled to brutish beasts,
33:     And men have lost their reason. Bear with me;
34:     My heart is in the coffin there with Caesar,
35:     And I must pause till it come back to me. 
A: 7,24
AFTER: 3
ALL: 11,11,23,30
AM: 29
AMBITION: 20,25
AMBITIOUS: 6,14,18,21,26
AN: 10,15,22,27
AND: 8,9,13,15,22,27,33,35
ANSWER'D: 8
ARE: 11
ART: 32
BACK: 35
BE: 5,20
BEAR: 33
BEASTS: 32
BONES: 4
BROUGHT: 16
BRUTISH: 32
BRUTUS: 5,9,10,14,15,21,22,26,28
BURY: 2
BUT: 14,29
CAESAR: 2,5,6,8,18,19,34
CAESAR'S: 12
CAPTIVES: 16
CAUSE: 30,31
COFFERS: 17
COFFIN: 34
COME: 2,12,35
COUNTRYMEN: 1
CRIED: 19
CROWN: 24
DID: 17,18,23,25,30
DISPROVE: 28
DO: 3,29
EARS: 1
EVIL: 3
FAITHFUL: 13
FAULT: 7
FILL: 17
FLED: 32
FOR: 10,31
FRIEND: 13
FRIENDS: 1
FUNERAL: 12
GENERAL: 17
GOOD: 4
GRIEVOUS: 7
GRIEVOUSLY: 8
HATH: 6,8,16,19
HAVE: 19,33
HE: 13,14,16,21,25,26,27
HEART: 34
HERE: 9,29
HIM: 2,24,30,31
HOME: 16
HONOURABLE: 10,11,15,22,27
I: 2,12,24,28,29,29,35
IF: 7
IN: 12,18,34
INTERRED: 4
IS: 4,10,15,22,27,34
IT: 5,7,7,8,35
JUDGMENT: 32
JUST: 13
KINGLY: 24
KNOW: 29
LEAVE: 9
LEND: 1
LET: 5
LIVES: 3
LOST: 33
LOVE: 30
LUPERCAL: 23
MADE: 20
MAN: 10,15,22,27
MANY: 16
ME: 1,13,33,35
MEN: 3,11,33
MOURN: 31
MUST: 35
MY: 13,34
NOBLE: 5
NOT: 2,28,30
O: 32
OF: 9,20
OFT: 4
ON: 23
ONCE: 30
PAUSE: 35
POOR: 19
PRAISE: 2
PRESENTED: 24
RANSOMS: 17
REASON: 33
REFUSE: 25
REST: 9
ROMANS: 1
ROME: 16
SAYS: 14,21,26
SEE: 23
SEEM: 18
SHOULD: 20
SO: 5,7,11
SPEAK: 12,28,29
SPOKE: 28
STERNER: 20
STUFF: 20
SURE: 27
THAT: 3,19,23
THE: 3,4,5,9,17,19,23,34
THEIR: 4,33
THEM: 3
THEN: 31
THERE: 34
THEY: 11
THIS: 18,25
THOU: 32
THRICE: 24,25
TILL: 35
TO: 2,2,12,13,16,28,29,31,32,35
TOLD: 6
UNDER: 9
WAS: 6,7,13,14,21,25,26
WEPT: 19
WERE: 7
WHAT: 28,29,31
WHEN: 19
WHICH: 25
WHOSE: 17
WITH: 4,5,33,34
WITHHOLDS: 31
WITHOUT: 30
YET: 21,26
YOU: 6,23,30,31
YOUR: 1
lines: 35
distinct words: 135
*/
