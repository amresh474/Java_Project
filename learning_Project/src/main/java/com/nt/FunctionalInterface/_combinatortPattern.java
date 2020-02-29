package com.nt.FunctionalInterface;

import java.time.LocalDate;

public class _combinatortPattern {
	
	public static void main(String[] args) {
		Customer customer=new Customer(
							"amresh kumar", 
							"amreshkumar@gmail.com",
							"+04576534653",
							LocalDate.of(2000, 12, 10)); 
		
		CustomerService validatorService=new CustomerService();		
		validatorService.isvalid(customer);
		
		System.out.println(new CustomerService().isvalid(customer));
		
		// if valid we can store customer in db
		
		// using combinator pattern 
		ValidationResult result=CustomerRegistrationValidator
												.isEmailValid()
												.and(CustomerRegistrationValidator.isPhoneValid())
												.and(CustomerRegistrationValidator.isAnadult()).apply(customer);
		
		System.out.println(result);
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());

		}

	}

}
