package com.nt.ImmutableClass;

/*
A Strategy for Defining Immutable Objects

The following rules define a simple strategy for creating immutable objects. 
Not all classes documented as "immutable" follow these rules. This does not necessarily mean the 
creators of these classes were sloppy — they may have good reason for believing that instances of 
their classes never change after construction. However, such strategies require sophisticated analysis
and are not for beginners.

Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
Make all fields final and private.
Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. 
A more sophisticated approach is to make the constructor private and construct instances in factory methods.
If the instance fields include references to mutable objects, don't allow those objects to be changed:
Don't provide methods that modify the mutable objects.
Don't share references to the mutable objects. Never store references to external, mutable objects passed 
to the constructor; if necessary, create copies, and store references to the copies. Similarly, 
create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.

*/

public final class Employee {
	private final int id;
	private Address address;

	public Employee(int id, Address address) {
		this.id = id;
		this.address = new Address(); // defensive copy
		this.address.setStreet(address.getStreet());
	   // this.address=address.clone();
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		Address nuAdd = new Address(); // must copy here too
		nuAdd.setStreet(address.getStreet());
		return nuAdd;
		// return (Address) address.clone();
	}
}
