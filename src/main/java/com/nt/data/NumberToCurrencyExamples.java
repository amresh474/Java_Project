package com.nt.data;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberToCurrencyExamples {

	public static void main(String[] args) {
		// This is the amount which we want to format
		Double currencyAmount = new Double(123456789.555);

		// Get current locale information
		Locale currentLocale = Locale.getDefault();

		// Get currency instance from locale; This will have all currency related
		// information
		Currency currentCurrency = Currency.getInstance(currentLocale);
		System.out.println("                " + currentCurrency);
		// Currency Formatter specific to locale
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		System.out.println("            " + currencyFormatter);
		// Test the output
		System.out.println(currentLocale.getDisplayName());

		System.out.println(currentCurrency.getDisplayName());
		System.out.println(currencyFormatter.format(currencyAmount));

		// Using France locale
		Locale currentLocale1 = Locale.FRANCE;

		// Get currency instance from locale; This will have all currency related
		// information
		Currency currentCurrency1 = Currency.getInstance(currentLocale1);
		System.out.println("&&&&&&" + currentCurrency1);

		// Currency Formatter specific to locale
		NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(currentLocale1);
		System.out.println("666666" + currencyFormatter1);

		// Test the output
		System.out.println(currentLocale1.getDisplayName());

		System.out.println(currentCurrency1.getDisplayName());

		System.out.println(currencyFormatter1.format(currencyAmount));
	}

}
