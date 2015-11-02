package com.hoyouly.chap3;

public class Number {

	int i;
	
	public static void main(String[] args) {
		Number n1=new Number();
		Number n2=new Number();
		
		n1.i=9;
		n2.i=27;
		System.out.println("n1.i :"+n1.i+" n2.i:"+n2.i);
		System.out.println("n1 :"+n1.hashCode()+ "n2 "+n2.hashCode());
		n1=n2;
		System.out.println("n1.i :"+n1.i+" n2.i:"+n2.i);
		System.out.println("n1 :"+n1.hashCode()+ "n2 "+n2.hashCode());

		n1.i=34;
		System.out.println("n1.i :"+n1.i+" n2.i:"+n2.i);
		System.out.println("n1 :"+n1.hashCode()+ "n2 "+n2.hashCode());

	}
}
