package com.hoyouly.chap14;

import java.util.ArrayList;
import java.util.List;

import com.hoyouly.chap14.bean.Pet;

public class ForNameCreator extends PetCreator {

	private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames={
		"com.hoyouly.chap14.bean.Mutt",
		"com.hoyouly.chap14.bean.Pug",
		"com.hoyouly.chap14.bean.EgyptianMau",
		"com.hoyouly.chap14.bean.Manx",
		"com.hoyouly.chap14.bean.Cymric",
		"com.hoyouly.chap14.bean.Rat",
		"com.hoyouly.chap14.bean.Mouse",
		"com.hoyouly.chap14.bean.Hamster"
	};
	
	@SuppressWarnings({"unchecked"})
	private static void loader(){
		for (String name : typeNames) {
			try {
				types.add((Class<? extends Pet>)Class.forName(name));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	static { loader();}
	
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
