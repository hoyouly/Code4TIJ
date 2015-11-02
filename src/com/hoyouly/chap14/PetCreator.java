package com.hoyouly.chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.hoyouly.chap14.bean.Pet;

public abstract class PetCreator {

	private Random rand=new Random(47);
	
	public abstract List<Class<? extends Pet> > types();
	
	public Pet randomPet(){//创建一个随机的 Pet
		int n=rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public Pet[] creatArray(int n){
		Pet[] result =new Pet[n];
		for (int i=0;i<n;i++) {
			result[i]=randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result =new ArrayList<Pet>();
		Collections.addAll(result, creatArray(size));
		return result;
	}
}
