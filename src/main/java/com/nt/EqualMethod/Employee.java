package com.nt.EqualMethod;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Employee e = (Employee) o;
		return (this.getId() == e.getId());
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		return result;
	}

}
