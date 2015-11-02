package com.hoyouly.chap8;

public class Cheese {

	Cheese() {
		System.out.println("public  Cheese");
	}

	private Bread b = new Bread();
	// public Cheese c=new Cheese();
	public Sandwich s = new Sandwich();

	public static void main(String[] args) {
		// new Sandwich();
		new Cheese();
	}

}
