//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list12\Polynomial.java

package chap08.list12;

import chap08.list11.Term;

public class Polynomial {
    // Instances are immutable.
    // The implementation is a circular linked list with a dummy head node.
    // Every other node in the list references a distinct Term object
    // which represents a term in the polynomial.
    // Invariants: ZERO is unique;
    //             if this != ZERO, then head.next != head;
    //             terms are kept in decreasing order of their exp fields;
    //             degree == head.next.term.exp;
    //             there are no null references.

    private Node head = new Node();  // dummy node

    public static final Polynomial ZERO = new Polynomial();

    private Polynomial() {
    }

    public Polynomial(double coef, int exp) {
        head.next = new Node(new Term(coef, exp), head);
    }

    public Polynomial(Term term) {
        this(term.getCoef(), term.getExp());
    }

    public Polynomial(Polynomial that) {  // copy constructor
        Node p = this.head, q = that.head.next;
        while (q != that.head) {
            p = p.next = new Node(new Term(q.term), head);
            q = q.next;
        }
    }

    public int degree() {
        return head.next.term.getExp();
    }

    public boolean equals(Object object) {
        if (!(object instanceof Polynomial)) return false;
        Polynomial that = (Polynomial)object;
        Node p = this.head.next, q = that.head.next;
        while (q != that.head) {
            if (!(p.term.equals(q.term))) return false;
            p = p.next;
            q = q.next;
        }
        return p == head;
    }


    public Polynomial plus(Polynomial that) {
        if (this.equals(ZERO)) return new Polynomial(that);
        Polynomial sum = new Polynomial(this);
        for (Node p = that.head.next; p != that.head; p = p.next)
          sum = sum.plus(p.term);
        return sum;
    }

    public Polynomial plus(Term term) {
        if (this.equals(ZERO)) return new Polynomial(term);
        Polynomial sum = new Polynomial(this);
        if (term.equals(Term.ZERO)) return sum;
        int termExp = term.getExp();
        Node p = sum.head;
        while (p.next.term.getExp() > termExp)
            p = p.next;
        if (p.next.term.getExp() == termExp) 
            p.next.term = p.next.term.plus(term);
        else p.next = new Node(term, p.next);
        return sum;
    }

    public Polynomial times(double factor) {
        if (this.equals(ZERO) || factor==0.0) return ZERO;
        Polynomial result = ZERO;
        for (Node p = head.next; p != head; p = p.next)
            result = result.plus(p.term.times(factor));
        return result;
    }

    public Polynomial times(Term term) {
        if (this.equals(ZERO) || term.equals(Term.ZERO)) return ZERO;
        Polynomial result = ZERO;
        for (Node p = head.next; p != head; p = p.next)
            result = result.plus(p.term.times(term));
        return result;
    }

    public Polynomial times(Polynomial that) {
        if (this.equals(ZERO) || that.equals(ZERO)) return ZERO;
        Polynomial result = ZERO;
        for (Node p = head.next; p != head; p = p.next)
            result = result.plus(that.times(p.term));
        return result;
    }

    public String toString() {
        if (this.equals(ZERO)) return "0";
        Node p = head.next;
        StringBuffer buf = new StringBuffer(p.term.toString());
        for (p = p.next; p != head; p = p.next)
            buf.append( (p.term.getCoef()<0 ? " - " : " + ") + p.term.abs());
        return buf.toString();
    }

    public double valueAt(double x) {
        if (this.equals(ZERO)) return 0.0;
        double y = 0.0;
        Node p = head.next;
        int exp = p.term.getExp();
        while (p.next != head) {
            double coef = p.term.getCoef();
            int nextExp = p.next.term.getExp();
            y = (y + coef)*Math.pow(x, exp - nextExp);
            exp = nextExp;
            p = p.next;
        }
        return (y + p.term.getCoef())*Math.pow(x, exp);
    }

    private static class Node {
        Term term;
        Node next;
        Node() { this.term = Term.ZERO; this.next = this; }  // dummy node
        Node(Term term, Node next) { this.term = term; this.next = next; }
    }
}
