package com.roman;

import com.roman.exception.RomanConverterException;

public class RomanConverter {

	public static String convert(int number) throws RomanConverterException {

		if (number < 1 || number > 4999) {
			throw new RomanConverterException();
		}

		String result = "";
		int count = 0;

		while (number > 0) {
			int temp = number % 10;

			if (count == 0) {
				if (temp < 4) {
					for (int i = 1; i <= temp; i++) {
						result += "I";
					}
				} else if (temp == 4) {
					result = "IV";
				} else if (temp < 9) {
					result = "V";
					for (int i = 6; i <= temp; i++) {
						result += "I";
					}
				} else if (temp == 9) {
					result = "IX";
				}
			} else if (count == 1) {
				if (temp < 4) {
					for (int i = 1; i <= temp; i++) {
						result = "X" + result;
					}
				} else if (temp == 4) {
					result = "XL";
				} else if (temp < 9) {
					String tempResult = "L";
					for (int i = 6; i <= temp; i++) {
						tempResult += "X";
					}
					result = tempResult + result;
				} else if (temp == 9) {
					result = "XC" + result;
				}
			} else if (count == 2) {
				if (temp < 4) {
					for (int i = 1; i <= temp; i++) {
						result = "C" + result;
					}
				} else if (temp == 4) {
					result = "CD" + result;
				} else if (temp < 9) {
					String tempResult = "D";
					for (int i = 6; i <= temp; i++) {
						tempResult += "C";
					}
					result = tempResult + result;
				} else if (temp == 9) {
					result = "CM" + result;
				}
			} else if (count == 3) {
				if (temp <= 4) {
					for (int i = 1; i <= temp; i++) {
						result = "M" + result;
					}
				}
			}

			count++;
			number /= 10;
		}
		return result;
	}

}
