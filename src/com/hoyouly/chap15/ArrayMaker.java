package com.hoyouly.chap15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {

	private Class<T> type;

	public ArrayMaker(Class<T> type) {
		this.type = type;
	}

	T[] creat(int size) {
		return (T[]) Array.newInstance(type, size);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
		String[] stringArray = stringMaker.creat(9);
		System.out.println(Arrays.toString(stringArray));
	}

}
