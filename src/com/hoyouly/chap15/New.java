package com.hoyouly.chap15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class New {

	public static <K, V> HashMap<K, V> hashMap() {
		return new HashMap<K, V>();
	}

	public static <T> List<T> arrayList() {
		return new ArrayList<T>();
	}

	public static <T> LinkedList<T> linkedList() {
		return new LinkedList<T>();
	}
	public static <T> Set<T> hashSet() {
		return new HashSet<T>();
	}
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}
	
	public static void main(String [] args){
//		Map< String, Integer> value=hashMap();
		Integer [][]nums={
				{1,2,3,4,5,6,7},
				{11,22,33,44,6,7,8,9,0,1},
				{111,222,333,444,77,2},
				{5,6,7,8},
				
		};
		System.out.println("长度："+nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i:"+i+" 长度："+nums[i].length);
			for (int j = 0; j < nums.length; j++) {
				
			}
		}
		
	}
	
	public void testArray(){
		Integer [][] nums={
				{1,2,3,4},
				{11,22,33,44},
				{111,222,333,444},
				{5,6,7,8},
				
		};
	}
}
