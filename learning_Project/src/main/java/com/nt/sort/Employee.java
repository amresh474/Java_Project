package com.nt.sort;

import java.time.LocalDate;

import lombok.Data;

@Data

public class Employee implements Comparable<Employee> {
	private Long id;
	private String name;
	private LocalDate dob;

	public Employee(Long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	 @Override
	    public int compareTo(Employee o) {
	        return this.getId().compareTo(o.getId());
	    }

}
