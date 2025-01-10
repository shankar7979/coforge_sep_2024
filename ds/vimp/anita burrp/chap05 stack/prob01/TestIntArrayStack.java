//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap05\prob01\TestIntArrayStack.java

package chap05.prob01;

public class TestIntArrayStack {
    public TestIntArrayStack() {
        IntArrayStack s = new IntArrayStack(100);
        System.out.println("s.size(): " + s.size());
        s.push(22);
        s.push(44);
        s.push(66);
        System.out.println("s.size(): " + s.size() + "\ts.peek(): " + s.peek());
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
        s.push(55);
        s.push(77);
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
        System.out.println("s.size(): " + s.size() + "\ts.pop(): " + s.pop());
    }
    
    public static void main(String[] args) {
        new TestIntArrayStack();
    }
}

/*  Output:
s.size(): 0
s.size(): 3     s.peek(): 66
s.size(): 3     s.pop(): 66
s.size(): 2     s.pop(): 44
s.size(): 3     s.pop(): 77
s.size(): 2     s.pop(): 55
s.size(): 1     s.pop(): 22
java.lang.IllegalStateException: stack is empty
        int chap05.prob01.IntArrayStack.pop()
                IntArrayStack.java:23
        void chap05.prob01.TestIntArrayStack.<init>()
                TestIntArrayStack.java:21
        void chap05.prob01.TestIntArrayStack.main(java.lang.String[])
                TestIntArrayStack.java:25
Exception in thread main
*/
