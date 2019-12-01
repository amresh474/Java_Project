package com.nt.SingletonPattern;

public class EnumDemo {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}
