//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap08\list11\Term.java

package chap08.list11;

public class Term {
    // Instances are immutable.
    // Invariants: ZERO is unique;
    //             if this != ZERO, then coef != 0.0 and exp >= 0.

    private double coef;
    private int exp;

    public static final Term ZERO = new Term();

    private Term() {
        this.exp = -1;
    }

    public Term(double coef, int exp) {
        if (coef == 0.0 || exp < 0) throw new IllegalArgumentException();
        this.coef = coef;
        this.exp = exp;
    }

    public Term(Term that) {  // copy constructor
        this(that.coef, that.exp);
    }

    public Term abs() {
        return new Term(Math.abs(coef), exp);
    }

    public boolean equals(Object object) {
        if (object == this) return true;
        if (!(object instanceof Term)) return false;
        Term that = (Term)object;
        return (this.coef==that.coef && this.exp==that.exp);
    }

    public double getCoef() {
        return coef;
    }

    public int getExp() {
        return exp;
    }

    public Term plus(Term that) {
        if (that.exp != this.exp) throw new IllegalArgumentException();
        double coef = this.coef + that.coef;
        if (coef == 0.0) return ZERO;
        return new Term(coef, this.exp);
    }

    public Term times(double factor) {
        if (factor == 0.0) return ZERO;
        return new Term(coef*factor, exp);
    }

    public Term times(Term that) {
        if (that.coef == 0.0) return ZERO;
        return new Term(this.coef*that.coef, this.exp + that.exp);
    }

    public String toString() {
        if (coef == 0.0) return "0";
        if (exp == 0) return Double.toString(coef);
        String str;
        if (coef == 1.0) str = "";
        else if (coef == -1.0) str = "-";
        else str = "" + (float)coef;
        if (exp == 0) return str;
        if (exp == 1) return str + "x";
        return str + "x^" + exp;
    }

    public double valueAt(double x) {
        return coef*Math.pow(x, exp);
    }
}
