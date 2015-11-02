package com.hoyouly.chap15;

public class Fibonacci implements Generator<Integer> {

	private int count = 0;

	private int fib(int n) {
		if (n < 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

	@Override
	public Integer next() {
		return fib(count++);
	}

	public static void main(String [] args){
		Fibonacci fi=new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.print(fi.next()+" ");
		}
	}
}
