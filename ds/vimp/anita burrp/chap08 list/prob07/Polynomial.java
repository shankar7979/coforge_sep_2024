//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\prob07\Polynomial.java

package chap08.prob07;

import chap08.list11.Term;

public class Polynomial {

    private Node head = new Node();  // dummy node;

    public static final Polynomial ZERO = new Polynomial();

    private Polynomial() {
    }

    public Polynomial(double coef, int exp) {
        head.next = new Node(coef, exp, head);
    }

    public Polynomial(Polynomial that) {  // copy constructor
        Node p = this.head, q = that.head.next;
        while (q != that.head) {
            p = p.next = new Node(q);
            p.next = head;
            q = q.next;
        }
    }

    public int degree() {
        return head.next.exp;
    }

    public Polynomial derivative() {
        if (degree() < 1) return ZERO;
        Polynomial poly = new Polynomial();
        for (Node p = head.next; p != head; p = p.next) {
            double coef = p.exp*p.coef;
            if (coef != 0 && p.exp > 0)
                poly = poly.plus(new Polynomial(coef, p.exp-1));
        }
        return poly;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Polynomial)) return false;
        Polynomial that = (Polynomial)object;
        Node p = this.head.next, q = that.head.next;
        while (q != that.head) {
            if (p.coef != q.coef || p.exp != q.exp) return false;
            p = p.next;
            q = q.next;
        }
        return p == head;
    }

    public Polynomial plus(Polynomial that) {
        if (this.equals(ZERO)) return new Polynomial(that);
        if (that.equals(ZERO)) return new Polynomial(this);
        Polynomial sum = new Polynomial(this);
        Node p = sum.head, q = that.head.next;
        while (p.next != sum.head && q != that.head) { 
            if (p.next.exp <= q.exp) {
                if (p.next.exp == q.exp) p.next.coef += q.coef;
                else p.next = new Node(q.coef, q.exp, p.next);
                q = q.next;
            }
            p = p.next;
        }
        if (q != that.head) p.next = new Node(q.coef, q.exp, p.next);
        return sum;
    }

    public Polynomial times(double factor) {
        if (this.equals(ZERO) || factor==0.0) return ZERO;
        Polynomial result = new Polynomial(this);
        for (Node p = result.head.next; p != result.head; p = p.next)
            p.coef *= factor;
        return result;
    }

    public Polynomial times(Polynomial that) {
        if (this.equals(ZERO) || that.equals(ZERO)) return ZERO;
        Polynomial result = ZERO;
        for (Node p = this.head.next; p != this.head; p = p.next) {
            Polynomial temp = new Polynomial(that);
            for (Node q = temp.head.next; q != temp.head; q = q.next){
                q.coef *= p.coef;
                q.exp += p.exp;
            }
            result = result.plus(temp);
        }
        return result;
    }

    public String toString() {
        if (this.equals(ZERO)) return "0";
        Node p = head.next;
        StringBuffer buf = new StringBuffer(p.coef + "x^" + p.exp);
        for (p = p.next; p != head; p = p.next) {
            buf.append( (p.coef<0 ? " - " : " + ") + Math.abs(p.coef));
            if (p.exp > 0) buf.append("x");
            if (p.exp > 1) buf.append("^" + p.exp);
        }
        return buf.toString();
    }

    public double valueAt(double x) {
        if (this.equals(ZERO)) return 0.0;
        double y = 0.0;
        Node p = head.next;
        int exp = p.exp;
        while (p.next != head) {
            double coef = p.coef;
            int nextExp = p.next.exp;
            y = (y + coef)*Math.pow(x, exp - nextExp);
            exp = nextExp;
            p = p.next;
        }
        return (y + p.coef)*Math.pow(x, exp);
    }

    private static class Node {
        double coef;
        int exp;
        Node next;
        Node() { this(0.0, -1, null); next = this; }
        Node(Node that) { this(that.coef, that.exp, that.next); }
        Node(double c, int e, Node n) { coef = c; exp = e; next = n; }
    }
}
