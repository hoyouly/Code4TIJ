package com.hoyouly.chap10;

public class Egg {

	protected class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk");
		}
	}
	
	public Egg(){
		System.out.println("Egg");
		new Yolk();
	}

}

