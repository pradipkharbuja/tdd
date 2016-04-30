package com.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.roman.exception.RomanConverterException;

public class RomanConverterTest {

	@Test(expected = RomanConverterException.class)
	public void testFor0() {
		RomanConverter.convert(0);
	}

	@Test(expected = RomanConverterException.class)
	public void testFor5000() {
		RomanConverter.convert(5000);
	}

	@Test
	public void testFor1() {
		assertEquals("I", RomanConverter.convert(1));
	}

	@Test
	public void testFor4() {
		assertEquals("IV", RomanConverter.convert(4));
	}

	@Test
	public void testFor5() {
		assertEquals("V", RomanConverter.convert(5));
	}

	@Test
	public void testFor8() {
		assertEquals("VIII", RomanConverter.convert(8));
	}
	
	@Test
	public void testFor9() {
		assertEquals("IX", RomanConverter.convert(9));
	}
	
	@Test
	public void testFor10() {
		assertEquals("X", RomanConverter.convert(10));
	}

	@Test
	public void testFor13() {
		assertEquals("XIII", RomanConverter.convert(13));
	}

	@Test
	public void testFor14() {
		assertEquals("XIV", RomanConverter.convert(14));
	}

	@Test
	public void testFor15() {
		assertEquals("XV", RomanConverter.convert(15));
	}

	@Test
	public void testFor19() {
		assertEquals("XIX", RomanConverter.convert(19));
	}
	
	@Test
	public void testFor20() {
		assertEquals("XX", RomanConverter.convert(20));
	}
	
	@Test
	public void testFor40() {
		assertEquals("XL", RomanConverter.convert(40));
	}
	
	@Test
	public void testFor50() {
		assertEquals("L", RomanConverter.convert(50));
	}
	
	@Test
	public void testFor80() {
		assertEquals("LXXX", RomanConverter.convert(80));
	}
	
	@Test
	public void testFor90() {
		assertEquals("XC", RomanConverter.convert(90));
	}
	
	@Test
	public void testFor100() {
		assertEquals("C", RomanConverter.convert(100));
	}
	
	@Test
	public void testFor139() {
		assertEquals("CXXXIX", RomanConverter.convert(139));
	}
	
	@Test
	public void testFor267() {
		assertEquals("CCLXVII", RomanConverter.convert(267));
	}
	
	@Test
	public void testFor499() {
		assertEquals("CDXCIX", RomanConverter.convert(499));
	}	
	
	@Test
	public void testFor687() {
		assertEquals("DCLXXXVII", RomanConverter.convert(687));
	}	

	@Test
	public void testFor988() {
		assertEquals("CMLXXXVIII", RomanConverter.convert(988));
	}
	
	@Test
	public void testFor1000() {
		assertEquals("M", RomanConverter.convert(1000));
	}	
	
	@Test
	public void testFor4839() {
		assertEquals("MMMMDCCCXXXIX", RomanConverter.convert(4839));
	}	
}
