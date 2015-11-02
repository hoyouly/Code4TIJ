package com.hoyouly.chap15.ch6;

import java.util.ArrayList;

import com.hoyouly.chap15.Generators;
/**
 *  架子
 * @author hoyouly
 *
 */
public class Shelf extends ArrayList<Product> {
	public Shelf(int product) {
		Generators.fill(this, Product.generator, product);
	}

	/**
	 * 可以不使用继承集合的方式实现的，就像下面那样，但是那种方式更方便呢，
	 * 	使用继承集合的方式，一：代码看起来很简练，二：可以直接使用高级for 循环，而不必提供新的方法
	 * 
	     public class Shelf  {
			private ArrayList<Product> shelfs=new ArrayList<Product>();
			public Shelf(int product) {
				Generators.fill(shelfs, Product.generator, product);
			}
			public ArrayList<Product> getShelfs() {
				return shelfs;
			}
		}
	 * 
	 * 
	 * 
	 * 
	 */
}
