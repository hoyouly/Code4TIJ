package com.hoyouly.chap15.coffee;

import java.util.ArrayList;
import java.util.List;

public class Mocha extends Coffee {

	 private List<? extends Coffee> coffee=new ArrayList<Mocha>();

	@Override
	public String toString() {
//		coffee.add(new Mocha());
		return super.toString();
	}
	 
}
