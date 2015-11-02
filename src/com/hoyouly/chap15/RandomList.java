package com.hoyouly.chap15;

import java.util.ArrayList;
import java.util.Random;

/**
 * 每次调用select方法，都会随机的选取一个元素
 * 
 * @author hoyouly
 * 
 */
public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	// 47 是一个种子 对于种子相同的Random对象，生成的随机数序列是一样的
	// private Random random = new Random(47); 尽管作者很喜欢47 但是这里也不能填上47 因为如果填写47的话，就不是随机数了
	private Random random = new Random();

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for (String s : "this quick brown fox jumped over  this lazy brown dog".split(" ")) {
			rs.add(s);
		}

		for (int i = 0; i < 11; i++) {
			System.out.print(rs.select() + "  ");
		}

	}

}
