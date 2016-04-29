package org.prime.factor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeFactorTest {

	private List<Integer> result = new ArrayList<>();
	
	@Test
	public void testFor1() {
		assertEquals(result, PrimeFactor.getResult(1));
	}

	@Test
	public void testFor2() {
		result.add(2);
		assertEquals(result, PrimeFactor.getResult(2));
	}
	
	@Test
	public void testFor4() {
		result.add(2);
		result.add(2);
		assertEquals(result, PrimeFactor.getResult(4));
	}
	
	@Test
	public void testFor100() {
		result.add(2);
		result.add(2);
		result.add(5);
		result.add(5);
		assertEquals(result, PrimeFactor.getResult(100));
	}
}

