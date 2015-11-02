package com.hoyouly.chap15;

/**
 * 生成器，专门用来创建对象的类，无需额外的信息就知道如何创建新对象
 * 
 * @author hoyouly
 * 
 */
public interface Generator<T> {

	/**
	 * 用于产生新的对象
	 * @return 
	 */
	T next();
}
