package com.hoyouly.chap14;

import java.util.HashMap;

import com.hoyouly.chap14.bean.Cat;
import com.hoyouly.chap14.bean.Cymric;
import com.hoyouly.chap14.bean.Dog;
import com.hoyouly.chap14.bean.Hamster;
import com.hoyouly.chap14.bean.Manx;
import com.hoyouly.chap14.bean.Mouse;
import com.hoyouly.chap14.bean.Mutt;
import com.hoyouly.chap14.bean.Pet;
import com.hoyouly.chap14.bean.Pug;
import com.hoyouly.chap14.bean.Rat;
import com.hoyouly.chap14.bean.Rodent;

public class PetCount {

	@SuppressWarnings("serial")
	static class PetCounter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}

	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for (Pet pet : creator.creatArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + "  ");
			if (pet instanceof Pet) {
				counter.count("Pet");
			}
			if (pet instanceof Dog) {
				counter.count("Dog");
			}
			if (pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if (pet instanceof Pug) {
				counter.count("Pug");
			}
			if (pet instanceof Cat) {
				counter.count("Cat");
			}
			if (pet instanceof Manx) {
				counter.count("Manx");
			}
			if (pet instanceof Cymric) {
				counter.count("Cymric");
			}
			if (pet instanceof Rodent) {
				counter.count("Cymric");
			}
			if (pet instanceof Mouse) {
				counter.count("Cymric");
			}
			if (pet instanceof Hamster) {
				counter.count("Cymric");
			}
			if (pet instanceof Rat) {
				counter.count("Rat");
			}
		}
		System.out.println();
		System.out.println(counter);
	}
	public static void main(String[] main) {
		countPets(new ForNameCreator());
	}

}
