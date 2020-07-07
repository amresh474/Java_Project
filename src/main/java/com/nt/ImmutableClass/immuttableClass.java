package com.nt.ImmutableClass;

public class immuttableClass {
	
	/*
	 * Immutable classes are those class, whose object can not be modified once
	 * created, it means any modification on immutable object will result in another
	 * immutable object. best example to understand immutable and mutable objects
	 * are, String and StringBuffer. Since String is immutable class, any change on
	 * existing string object will result in another string e.g. replacing a
	 * character into String, creating substring from String, all result in a new
	 * objects. While in case of mutable object like StringBuffer, any modification
	 * is done on object itself and no new objects are created. Some times this
	 * immutability of String can also cause security hole, and that the reason why
	 * password should be stored on char array instead of String.
	
	 
	 
	1. Declare the class as final so it can’t be extended.
	2. Make all fields private so that direct access is not allowed.
	3. Don’t provide setter methods for variables
	4. Make all mutable fields final so that it’s value can be assigned only once.
	5. Initialize all the fields via a constructor performing deep copy.
	6. Perform cloning of objects in the getter methods to return a copy rather than returning
	 the actual object reference.
	 * 
	 */
}
