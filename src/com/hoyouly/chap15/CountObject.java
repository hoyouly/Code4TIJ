package com.hoyouly.chap15;

/**
 * 一个包含有默认构造函数，并且是public ， 功能是可以记录一共创建了多少实例并可以通过toString()方法告诉我们
 * 
 * @author hoyouly
 * 
 */
public class CountObject {
	private static int counter = 0;

	private  long id = counter++;//这个时候id 的值并没有改变，只是在赋值后， counter 值变化了

	public long id() {
		return id;
	}

//	public CountObject(){
//		counter++;
//	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+" -- " + id;
	}

	public static void main(String[] args) {
		Generator<CountObject> gen = BasicGenerator.creat(CountObject.class);
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
	}
}
