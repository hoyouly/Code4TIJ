package com.hoyouly.chap10;


public class Egg2 {

	protected class Yolk{
		public Yolk(){
			System.out.println("Egg2.Yolk");
		}
		
		public void f(){
			System.out.println("Egg2.Yolk.f()");
		}
	}
	
	private Yolk yy=new Yolk();
	public Egg2(){
		System.out.println("Egg2");
		new Yolk();
	}
	
	public void insertYokl(Yolk y){
		yy=y;
	}
	
	public void g(){
		yy.f();
	}

}

