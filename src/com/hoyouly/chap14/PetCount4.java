package com.hoyouly.chap14;

import com.hoyouly.chap14.bean.Pet;

public class PetCount4 {

	public static void main(String [] args){
		TypeCounter counter =new TypeCounter(Pet.class);
		for (Pet pet : Pet.creatArray(20)) {
			System.out.print (pet.getClass().getSimpleName()+" ");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);
	}
}
