package com.hoyouly.chap14.bean;

import java.util.ArrayList;

import com.hoyouly.chap14.LiteralPetCreator;
import com.hoyouly.chap14.PetCreator;

public class Pet extends Individual {

	public static final PetCreator creator=new LiteralPetCreator();
	
	
	public Pet(String name) {
		super(name);
	}

	public Pet() {
		super();
	}
	
	public static Pet randomPet(){
		return creator.randomPet();
	}
	
	public static Pet[] creatArray(int n){
		return creator.creatArray(n);
	}
	
	
	public static  ArrayList<Pet> arrayList(int size){
		return creator.arrayList(size);
	}

}
