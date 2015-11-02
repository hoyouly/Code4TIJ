package com.hoyouly.chap10.ch8;

 interface Incremenentable {
	void increment();
}

 public class Calleel implements Incremenentable {
	private int i;

	public void increment() {
		i++;
		System.out.println(i);
	}

	public  static void main(String [] args){

		Calleel c1=new Calleel();
		Calleel2 c2=new Calleel2();
		MyIncrement.f(c2);
		
		Caller caller1=new Caller(c1);
		Caller caller2=new Caller(c2.getCallbackReference());
		
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
		
	}
}

 class MyIncrement {

	public void increment(){
		System.out.println("other operation .");
	}
	
   static void f(MyIncrement mi){
	   	mi.increment();
   }
}

class Calleel2 extends MyIncrement{
	private int i;
	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incremenentable{

		public void increment() {
			Calleel2.this.increment();
		}
	}
	
	Incremenentable getCallbackReference(){
		return new Closure();
	}
	
}


class Caller{
	private Incremenentable callbackReference;
	Caller(Incremenentable in){
		callbackReference=in;
	}
	
	void go(){
		callbackReference.increment();
	}
}






