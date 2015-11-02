package com.hoyouly.chap3;

public class Letter {

	char c;
	
	
	static void f(Letter l){
		System.out.println("f  l:"+l.hashCode());
		l.c='m';
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Letter l=new Letter();
		l.c='a';
		System.out.println("l.c  "+ l.c);
		System.out.println(" 1  l:"+l.hashCode());

		f(l);
		
		System.out.println("l.c  "+ l.c);
		System.out.println("2 l:"+l.hashCode());

		
	}

}
