package com.example.model;

public class Book {
	private int isbn;
	private String bname;
	private float cost;

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bname=" + bname + ", cost=" + cost + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
