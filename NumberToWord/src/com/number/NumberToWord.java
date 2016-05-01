package com.number;

public class NumberToWord {

	public static String convert(int number) {

		String[] results = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Tweleve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
				"Nineteen" };

		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if (number < 21) {
			return results[number];
		}

		String result = "";
		int count = 0;
		while (number > 0) {
			int temp = number % 10;

			if (count == 0) {
				if (temp > 0)
					result = results[temp];
			} else if (count == 1) {
				if (temp > 1) {
					result = tens[temp] + " " + result;
				}
			} else if (count == 2) {
				if (temp > 0) {
					if (!result.trim().equals("")) {
						result = results[temp] + " Hundred and " + result;
					} else {
						result = results[temp] + " Hundred";
					}
				}
			} else if (count == 3) {
				result = results[temp] + " Thousand " + result;
			}

			count++;
			number /= 10;
		}

		return result.trim();
	}

}
