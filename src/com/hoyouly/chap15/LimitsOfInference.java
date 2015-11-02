package com.hoyouly.chap15;

import java.util.List;
import java.util.Map;

import com.hoyouly.chap15.coffee.Coffee;

public class LimitsOfInference {

	static void f(Map<Coffee, List<? extends Coffee>> coffees) {

	}

	public static void main(String[] args) {
		// Map<Coffee, List<? extends Coffee>> coffees=New.hashMap();
		// f(New.hashMap()); 不可以 尽管Map<Coffee, List<? extends Coffee>> coffees=New.hashMap() 这样写是正确的
		// 编译器会自动找出具体类型 称为类型参数推断
		// 但是 类型推断只对赋值操作有效，其他时候并不起作用的
		f(New.<Coffee, List<? extends Coffee>> hashMap());//但是可以显示指明类型，
	}
}
