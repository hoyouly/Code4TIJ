package com.hoyouly.chap15.ch6;

import java.util.ArrayList;
/**
 * 通道，走道；侧廊
 * @author hoyouly
 *
 */
public class Aisle extends ArrayList<Shelf> {
	public Aisle(int shelfs, int product) {
		for (int i = 0; i < shelfs; i++) {
			add(new Shelf(product));
		}
	}

}
