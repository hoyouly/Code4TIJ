package com.hoyouly.chap14;

public class FamilyVsExactType {

	static class Base{};
	static class Derived extends Base{};
	
	static void test(Object x){
		System.out.println("Testing x of type : "+x.getClass());
		System.out.println("x instanceof Base : "+(x instanceof Base));
		System.out.println("x instanceof Derived : "+(x instanceof Derived));
		System.out.println("Base.class.isInstance(x) :"+Base.class.isInstance(x));
		System.out.println("Derived.class.isInstance(x) :"+Derived.class.isInstance(x));
		System.out.println("x.getClass()==Base.class  "+(x.getClass()==Base.class));
		System.out.println("x.getClass()==Derived.class  "+(x.getClass()==Derived.class));
		System.out.println("x.getClass().equals Base.class  "+(x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals Derived.class  "+(x.getClass().equals(Derived.class)));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Base());
		test(new Derived());

	}

}
