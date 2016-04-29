package org.bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void testFor0() {
		assertEquals(0, Bowling.getScore());
	}

	@Test
	public void testFor8(){
		assertEquals(0, Bowling.getScore(8));
	}
	
	@Test
	public void testFor8And1(){
		assertEquals(9, Bowling.getScore(8, 1));
	}
	
	@Test
	public void testFor3And4(){
		assertEquals(7, Bowling.getScore(3, 4));		
	}
	
	@Test
	public void testFor3And4And1(){
		assertEquals(7, Bowling.getScore(3, 4, 1));		
	}
	
	@Test
	public void testFor6And4(){
		assertEquals(0, Bowling.getScore(6, 4));		
	}
	
	@Test
	public void testFor6And4And7(){
		assertEquals(17, Bowling.getScore(6, 4, 7));		
	}
	
	@Test
	public void testFor6And4And7And2(){
		assertEquals(26, Bowling.getScore(6, 4, 7, 2));		
	}
	
	@Test
	public void testFor6And4And7And3(){
		assertEquals(17, Bowling.getScore(6, 4, 7, 3));		
	}
	
	@Test
	public void testFor6And4And7And3And8(){
		assertEquals(35, Bowling.getScore(6, 4, 7, 3, 8));		
	}
	
	@Test
	public void testFor6And4And7And3And8And1(){
		assertEquals(44, Bowling.getScore(6, 4, 7, 3, 8, 1));		
	}
	
	@Test
	public void testFor6And4And7And3And8And1And5And4(){
		assertEquals(53, Bowling.getScore(6, 4, 7, 3, 8, 1, 5, 4));		
	}
	
	@Test
	public void testFor6And4And7And3And8And1And5And4And10(){
		assertEquals(53, Bowling.getScore(6, 4, 7, 3, 8, 1, 5, 4, 10));		
	}
	
	@Test
	public void testFor6And4And7And3And8And1And5And4And10And1(){
		assertEquals(53, Bowling.getScore(6, 4, 7, 3, 8, 1, 5, 4, 10, -1, 1));		
	}
	
	@Test
	public void testFor6And4And7And3And8And1And5And4And10And1And4(){
		assertEquals(73, Bowling.getScore(6, 4, 7, 3, 8, 1, 5, 4, 10, -1, 1, 4));		
	}
}
