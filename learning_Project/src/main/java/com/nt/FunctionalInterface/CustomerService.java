package com.nt.FunctionalInterface;

import java.time.LocalDate;
import java.time.Period;

public class CustomerService {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneNumbervalid(String phoneNumber) {
		return phoneNumber.startsWith("+0");

	}

	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 18;
	}
	
	public boolean isvalid(Customer customer) {
		return isEmailValid(customer.getEmail())&&
				isPhoneNumbervalid(customer.getPhoneNumber())&&
				isAdult(customer.getDob());
	}
}
