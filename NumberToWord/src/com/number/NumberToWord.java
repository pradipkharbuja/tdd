package com.number;

public class NumberToWord {

	/* Converts from 0 to 999,999,999 */

	private static final String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	final static private String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(int number) {

		if (number < 20)
			return units[number];
		if (number < 100)
			return (tens[number / 10] + ((number % 10 > 0) ? " " + convert(number % 10) : "")).trim();
		if (number < 1000)
			return (units[number / 100] + " Hundred" + ((number % 100 > 0) ? " " + convert(number % 100) : "")).trim();
		if (number < 1000000)
			return (convert(number / 1000) + " Thousand" + ((number % 1000 > 0) ? " " + convert(number % 1000) : ""))
					.trim();
		return (convert(number / 1000000) + " Million"
				+ ((number % 1000000 > 0) ? " " + convert(number % 1000000) : "")).trim();

	}

}
