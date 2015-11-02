package com.hoyouly.chap14;

import java.util.ArrayList;
import java.util.List;

import com.hoyouly.chap14.factory.Factory;

public class Part {

	public String toString(){
		return getClass().getSimpleName();
	}
	
	static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();
}
