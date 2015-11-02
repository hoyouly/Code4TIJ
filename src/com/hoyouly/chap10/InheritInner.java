package com.hoyouly.chap10;

/**
 * 只继承内部类，不继承外部类
 * @author hoyouly
 *
 */
public class InheritInner extends WithInner.Inner {

	public InheritInner(WithInner wi){
		wi.super();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	WithInner wi=new WithInner();
	InheritInner it=new InheritInner(wi);
	}

}

class WithInner{
	class Inner{
		
	}
}
