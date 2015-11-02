package com.hoyouly.chap15.ch6;

import java.util.Random;

import com.hoyouly.chap15.Generator;

public class Product {

	private int id;
	private String description;
	private double price;

	public Product(int id, String description, double price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " : " + description + " . price: $ " + price;
	}

	public static Generator<Product> generator = new Generator<Product>() {

		private Random random = new Random();

		@Override
		public Product next() {
			return new Product(random.nextInt(1000), "test", Math.round(random.nextDouble() * 1000.0) + 0.99);
		}

	};

}
