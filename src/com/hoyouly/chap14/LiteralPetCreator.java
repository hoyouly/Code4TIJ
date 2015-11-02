package com.hoyouly.chap14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.hoyouly.chap14.bean.Cat;
import com.hoyouly.chap14.bean.Cymric;
import com.hoyouly.chap14.bean.Dog;
import com.hoyouly.chap14.bean.EgyptianMau;
import com.hoyouly.chap14.bean.Hamster;
import com.hoyouly.chap14.bean.Manx;
import com.hoyouly.chap14.bean.Mouse;
import com.hoyouly.chap14.bean.Mutt;
import com.hoyouly.chap14.bean.Pet;
import com.hoyouly.chap14.bean.Pug;
import com.hoyouly.chap14.bean.Rat;
import com.hoyouly.chap14.bean.Rodent;

public class LiteralPetCreator extends PetCreator {

	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(//
			Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class,//
			Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class));

	private static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
	public static void main(String [] args){
		System.out.println(types);
	}

}
