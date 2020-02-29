package com.nt.FunctionalInterface;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {

	private String name;
	private String email;
	private String phoneNumber;
	private LocalDate dob;

	public Customer(String name, String email, String phoneNumber, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dob=" + dob + "]";
	}

}
