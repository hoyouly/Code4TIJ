package com.hoyouly.chap15.coffee;

import java.util.Iterator;
import java.util.Random;

import com.hoyouly.chap15.Generator;


public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = { Latter.class, Mocha.class, Americano.class, Breve.class, Coppuccino.class };
	private Random random = new Random();

	public CoffeeGenerator() {

	}

	private int size = 0;

	private CoffeeGenerator(int size) {
		this.size = size;
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {

		int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		@Override
		public void remove() {
			new UnsupportedOperationException();
		}
	}

	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.print(gen.next() + "  ");
		}
		System.out.println("------");

		for (Coffee coffee : new CoffeeGenerator(5)) {//高级for 循环 里面对象必须是实现Iterable 接口才可以
			System.out.print(coffee.toString() + " ");
		}

	}

}
