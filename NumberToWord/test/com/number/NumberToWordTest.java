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
		assertEquals("One Hundred Forty Nine", NumberToWord.convert(149));
	}
	
	@Test
	public void testFor600() {
		assertEquals("Six Hundred", NumberToWord.convert(600));
	}
	
	@Test
	public void testFor999() {
		assertEquals("Nine Hundred Ninety Nine", NumberToWord.convert(999));
	}
	
	@Test
	public void testFor1000() {
		assertEquals("One Thousand", NumberToWord.convert(1000));
	}
	
	@Test
	public void testFor1008() {
		assertEquals("One Thousand Eight", NumberToWord.convert(1008));
	}
	
	@Test
	public void testFor6589() {
		assertEquals("Six Thousand Five Hundred Eighty Nine", NumberToWord.convert(6589));
	}
	
	@Test
	public void testFor10000() {
		assertEquals("Ten Thousand", NumberToWord.convert(10000));
	}
	
	@Test
	public void testFor10006() {
		assertEquals("Ten Thousand Six", NumberToWord.convert(10006));
	}
	
	@Test
	public void testFor97611() {
		assertEquals("Ninety Seven Thousand Six Hundred Eleven", NumberToWord.convert(97611));
	}
	
	@Test
	public void testFor80000(){
		assertEquals("Eighty Thousand", NumberToWord.convert(80000));
	}
	
	@Test
	public void testFor100000(){
		assertEquals("One Hundred Thousand", NumberToWord.convert(100000));
	}
	
	@Test
	public void testFor800000(){
		assertEquals("Eight Hundred Thousand", NumberToWord.convert(800000));
	}
	
	@Test
	public void testFor888888(){
		assertEquals("Eight Hundred Eighty Eight Thousand Eight Hundred Eighty Eight", NumberToWord.convert(888888));
	}
	
	@Test
	public void testFor1000000(){
		assertEquals("One Million", NumberToWord.convert(1000000));
	}
	
	@Test
	public void testFor999999999(){
		assertEquals("Nine Hundred Ninety Nine Million Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine", NumberToWord.convert(999999999));
	}
}
