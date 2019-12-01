package com.nt.student;

import lombok.Getter;
import lombok.Setter;

/*
Size: 4
Kundan   ;  singh  ;  Baliya
Amresh   ;  Kumar  ;  Bihar
Abhishek   ;  Pandey  ;  Ranchi
Amresh   ;  Kumar  ;  Bihar

As you can notice the output which contains the keys getting repeated for Chennai:Tamil Nadu.
In the normal case, we would expect the output to be as

Size: 3
Kundan   ;  singh  ;  Baliya
Amresh   ;  Kumar  ;  Bihar
Abhishek   ;  Pandey  ;  Ranchi

In the current code, the Hash Map is comparing the object itself rather than the data it contains i.e. 
the city and the state. To make it to identify and compare the data of the class rather than the object, 
we need to override the equals() and hashCode() methods.

*/

@Setter
@Getter
public class Student {
	private String firstName;
	private String lastName;
	private String gender;

	public Student(String fistName, String lastName, String gender) {
		this.firstName = fistName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((firstName == null) ? 0 : firstName.hashCode());
		result = result * prime + ((lastName == null) ? 0 : lastName.hashCode());
		return result;

	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Student std = (Student) obj;
		if (firstName == null) {
			if (std.firstName != null)
				return false;
		} else if (!firstName.equals(std.firstName))
			return false;
		if (lastName == null) {
			if (std.lastName != null)
				return false;
		} else if (!lastName.equals(std.lastName))
			return false;
		if (gender == null) {
			if (std.gender != null)
				return false;
		} else if (!gender.equals(std.gender))
			return false;

		return true;

	}

}
