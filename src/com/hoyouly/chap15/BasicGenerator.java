package com.hoyouly.chap15;

/**
 * 通用的构造器，可以为任何类构造一个Generator
 * 
 * 该类需要满足一下两点：
 * 	一：该类必须是 public 类型，并且不只是具有包内访问权限。
 *  二：该类必须有默认的构造函数，即无参构造函数
 * 
 * @author hoyouly
 * 
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;

	private BasicGenerator(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static <T> Generator<T> creat(Class<T> type) {
		return new BasicGenerator<T>(type);
	}

}
