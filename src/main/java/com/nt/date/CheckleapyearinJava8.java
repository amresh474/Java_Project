package com.nt.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class CheckleapyearinJava8 {
	public static void main(String[] args) {

		// 1. ZonedDateTime

		ZonedDateTime currentTime = ZonedDateTime.now();

		if (currentTime.toLocalDate().isLeapYear()) {
			System.out.println(currentTime.getYear() + " is a leap year");
		} else {
			System.out.println(currentTime.getYear() + " is NOT a leap year");
		}

		// 2. LocalDateTime

		LocalDateTime localDateTime = LocalDateTime.now();

		if (localDateTime.toLocalDate().isLeapYear()) {
			System.out.println(localDateTime.getYear() + " is a leap year");
		} else {
			System.out.println(localDateTime.getYear() + " is NOT a leap year");
		}

		// 3. LocalDate

		LocalDate localDate = LocalDate.now();

		if (localDate.isLeapYear()) {
			System.out.println(localDate.getYear() + " is a leap year");
		} else {
			System.out.println(localDate.getYear() + " is NOT a leap year");
		}

		// 4. Check current year is leap year or not

		if (Year.now().isLeap()) {
			System.out.println("Current year is a leap year");
		} else {
			System.out.println("Current year is NOT a leap year");
		}
	}

}
