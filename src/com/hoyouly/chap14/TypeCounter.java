package com.hoyouly.chap14;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class TypeCounter extends HashMap<Class<?>, Integer> {

	private Class<?> baseType;

	public TypeCounter(Class<?> baseType) {
		this.baseType = baseType;
	}

	public void count(Object obj) {
		Class<?> type = obj.getClass();
		if (!baseType.isAssignableFrom(type)) {
			throw new RuntimeException(obj + "incorrect type:" + type + ", should be type or subtype of " + baseType);
		}
		countClass(type);
	}
	private void countClass(Class<?> type) {
		Integer quantity = get(type);
		put(type, quantity == null ? 1 : quantity + 1);
		Class<?> superClass =type.getSuperclass();
		if(superClass!=null&&baseType.isAssignableFrom(superClass)){//isAssignableFrom 是用来判断一个类Class1和另一个类Class2是否相同或是另一个类的超类或接口。 对class对象
			countClass(superClass);
		}
	}
	
	public String toString(){
		StringBuilder result=new StringBuilder("{");
		for(Map.Entry<Class<? >, Integer> pair:entrySet()){
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("}");
		return result.toString();
	}
}
