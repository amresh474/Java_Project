package com.nt.sort;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {

	private long id;
	private String name;
	private LocalDate date;

	public Employee(long l, String name, LocalDate date) {
		super();
		this.id = l;
		this.name = name;
		this.date = date;
	}

}
