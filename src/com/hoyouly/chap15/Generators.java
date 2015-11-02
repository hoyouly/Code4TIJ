package com.hoyouly.chap15;

import java.util.ArrayList;
import java.util.Collection;

import com.hoyouly.chap15.coffee.Coffee;
import com.hoyouly.chap15.coffee.CoffeeGenerator;

public class Generators {

	/**
	 * 把 n 个 T 对象放进到集合 coll 中
	 * @param coll 集合
	 * @param gen  用来产生 T 对象的
	 * @param n 数量
	 * @return 存入n 个T对象后的集合coll
	 */
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}

	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for (Coffee cof : coffee) {
			System.out.print(cof + " ");
		}
		System.out.println();
		Collection<Integer> funmbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
		for (Integer i : funmbers) {
			System.out.print(i + " ");
		}
	}
}
