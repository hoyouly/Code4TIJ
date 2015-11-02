package com.hoyouly.chap10;

public class BigEgg2 extends Egg2 {

	public class Yolk extends Egg2.Yolk{//覆盖Egg2.Yolk 内部类
		public Yolk(){
			System.out.println("BigEgg2 Yolk");
		}
		
		public void f(){
			System.out.println("BigEgg2 Yolk .f()");
		}
	}
	public BigEgg2(){
		insertYokl(new Yolk());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigEgg2 be=new BigEgg2();
		be.g();
	}

}
