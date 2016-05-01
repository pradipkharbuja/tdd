package com.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordTest {

	@Test
	public void testFor0() {
		assertEquals("Zero", NumberToWord.convert(0));
	}
	
	@Test
	public void testFor19() {
		assertEquals("Nineteen", NumberToWord.convert(19));
	}
	
	@Test
	public void testFor21() {
		assertEquals("Twenty One", NumberToWord.convert(21));
	}

	@Test
	public void testFor30() {
		assertEquals("Thirty", NumberToWord.convert(30));
	}
	
	@Test
	public void testFor50() {
		assertEquals("Fifty", NumberToWord.convert(50));
	}
	
	@Test
	public void testFor98() {
		assertEquals("Ninety Eight", NumberToWord.convert(98));
	}
	
	@Test
	public void testFor100() {
		assertEquals("One Hundred", NumberToWord.convert(100));
	}
	
	@Test
	public void testFor149() {
		assertEquals("One Hundred and Forty Nine", NumberToWord.convert(149));
	}
	
	@Test
	public void testFor600() {
		assertEquals("Six Hundred", NumberToWord.convert(600));
	}
	
	@Test
	public void testFor999() {
		assertEquals("Nine Hundred and Ninety Nine", NumberToWord.convert(999));
	}
	
	@Test
	public void testFor1000() {
		assertEquals("One Thousand", NumberToWord.convert(1000));
	}
	
	@Test
	public void testFor6589() {
		assertEquals("Six Thousand Five Hundred and Eighty Nine", NumberToWord.convert(6589));
	}
}
