package com.nt.date;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class dateandTimeSimpleDateFormat implements Serializable {

	/** 
	 * SimpleDateFormat is NOT thread-safe.
	 * 
	 */
	private static final long serialVersionUID = -630957714324628542L;

	public static void main(String[] args) throws ParseException {
		dateTime();

	}

	@SuppressWarnings("unused")
	public static void dateTime() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);

		// Parse String to Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "15-10-2015 10:20:56";
		Date date1 = sdf1.parse(dateInString);
		System.out.println(date1);

		// Get current date

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(dateFormat.format(date2));

		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);

		// Get Current Time
		LocalTime time = LocalTime.now();
		System.out.println("local time now : " + time);

		// Convert Calendar to Date
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date3 = calendar.getTime();
		System.out.println(date3);

//		//	 Convert Date to Calendar
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		String dateInString1 = "27-04-2016 10:22:56";
//		Date date4 = sdf.parse(dateInString1);
//
//		Calendar calendar1 = Calendar.getInstance();
//		calendar1.setTime(date4);
//		System.out.println(calendar1);
//		
//		

		// Compare between two Dates

		Date date5 = new Date();
		Date date6 = new Date();

		int comparison = date6.compareTo(date5);
		System.out.println(comparison);

		// Since java 8, LocalDate class has overridden equal method to provide date
		// equality.
		LocalDate today1 = LocalDate.now();
		LocalDate date7 = LocalDate.of(2015, 12, 29);
		if (date7.equals(today1)) {
			System.out.printf("Today %s and date1 %s are same date %n", today, date1);
		} else {
			System.out.printf("Today %s and date1 %s arenot  same date %n", today, date1);
		}

		// Get date parts (year, month, day of month)

		System.out.println("Get date parts (year, month, day of month)");
		@SuppressWarnings("unused")
		Calendar calendar2 = new GregorianCalendar();

		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
		System.out.println(dayOfMonth);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(weekOfYear);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println(weekOfMonth);

		int hour = calendar.get(Calendar.HOUR); // 12 hour clock
		System.out.println(hour);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		System.out.println(hourOfDay);
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(second);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		System.out.println(millisecond);

		// FYI, in java 8, you can get different time units in below fashion.

		LocalDate today3 = LocalDate.now();
		int year1 = today.getYear();
		System.out.println(year1);
		int month2 = today.getMonthValue();
		System.out.println(month2);
		int day = today.getDayOfMonth();
		System.out.println(day);

//		Get Current User Locale
//		Get current locale in java web applications
//		Locale currentLocale = httpServletRequest.getLocale();
//		System.out.println(currentLocale.getDisplayLanguage());
//		System.out.println(currentLocale.getDisplayCountry());
//		System.out.println(currentLocale.getLanguage());
//		System.out.println(currentLocale.getCountry());

//		Get current locale in java desktop applications
		Locale currentLocale = Locale.getDefault();
		System.out.println(currentLocale.getDisplayLanguage());
		System.out.println(currentLocale.getDisplayCountry());

		System.out.println(currentLocale.getLanguage());
		System.out.println(currentLocale.getCountry());

		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.language"));

		
//		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MMM-yyyy");
//		String dateString = "14-Jul-2018";
//
//		try {
//			Date date9 = sdf.parse(dateString);
//			System.out.println(date9); // Sat Jul 14 00:00:00 IST 2018
//
//			String dateStr = sdf4.format(date);
//			System.out.println(dateStr); // 14-Jul-2018
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

	}
}
