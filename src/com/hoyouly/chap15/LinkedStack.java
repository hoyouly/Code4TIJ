package com.hoyouly.chap15;


/**
 * 自定义一个stack 类，实现传统的下推堆栈 ，实现内部链式存储机制
 * 大盒子套小盒子
 * 
 * @author hoyouly
 * 
 */
public class LinkedStack<T> {

	private static class Node<U> {//Node 是一个前端哨兵，
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {//这里面可以理解有大盒子套小盒子的，
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}

	}

	private Node<T> top = new Node<T>();

	public void push(T item) {//就是把该元素变成更大一个盒子套进去之前的盒子里面
		top = new Node<T>(item, top);
	}

	public T pop() {//就是取出来最大的盒子，
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String [] args){
		LinkedStack<String> lss=new LinkedStack<String>();
		for (String str : "Phars or sun".split(" ")) {
			lss.push(str);
		}
		String s=null;
		while((s=lss.pop())!=null){
			System.out.println(s);
		}
	}
	
	
}
