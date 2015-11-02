package com.hoyouly.chap15.ch6;

import java.util.ArrayList;

public class Store extends ArrayList<Aisle> {
	//checkout  检验；签出；结帐台；检出
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();

	public Store(int aisle, int shelfs, int product) {
		for (int i = 0; i < aisle; i++) {
			add(new Aisle(shelfs, product));
		}
	}

	
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		for (Aisle aisle : this) {
			for (Shelf shelf : aisle) {
				for (Product product : shelf) {
					result.append(product);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}

}
