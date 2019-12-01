package com.nt.SingletonPattern;

/*
	To overcome this situation with Reflection, 
	Joshua Bloch suggests the use of Enum to implement Singleton design
	pattern as Java ensures that any enum value is instantiated only once in a 
	Java program. Since Java Enum values are globally accessible, so is the singleton.
	The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy
	initialization.


*/

public enum EnumSingleton {

	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void doSomething() {
		// do something
	}

}
