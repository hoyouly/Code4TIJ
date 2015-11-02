package com.hoyouly.chap10.ch8;

public abstract class AAAA {
	private long eventTime;
	protected final long delayTime;

	public AAAA(long delayTime) {
		this.delayTime = delayTime;
		start();
	}

	public void start() {
		eventTime = System.nanoTime() + delayTime;
	}

	public abstract void action();

	public boolean ready() {
		return System.nanoTime() > eventTime;
	}


}
