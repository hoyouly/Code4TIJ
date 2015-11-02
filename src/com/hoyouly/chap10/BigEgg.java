package com.hoyouly.chap10;

public class BigEgg extends Egg {

	public class Yolk extends Egg.Yolk{
		public Yolk(){
			System.out.println("BigEgg Yolk");
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BigEgg();
	}

}
