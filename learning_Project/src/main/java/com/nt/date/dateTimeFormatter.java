package com.nt.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class dateTimeFormatter {

	private final static String TIMESTAMP_PATTERN = "MM/dd/yyyy hh:mm a z";

	private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(TIMESTAMP_PATTERN);

	public static void main(String[] args) throws DatatypeConfigurationException {

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());

		XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		// 1. Convert XMLGregorianCalendar to ZonedDateTime in current zone

		ZonedDateTime zdt = xgc.toGregorianCalendar().toZonedDateTime();
		System.out.println(DATE_TIME_FORMATTER.format(zdt));

		// 2. Convert XMLGregorianCalendar to ZonedDateTime in UTC

		ZonedDateTime zdtUTC = zdt.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println(DATE_TIME_FORMATTER.format(zdtUTC));

	}
}
