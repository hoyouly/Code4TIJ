package com.hoyouly.chap15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;

	public IterableFibonacci(int n) {
		this.n = n;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18)) {//如果要是想再循环语句中使用IterableFibonacci ,必须向构构造器中提供一个边界值
			System.out.print(i + "  ");
		}
	}

}
