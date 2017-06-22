package com.ex5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseStringSizeNone() {
		assertEquals("", ReverseString.reverse(""));
	}
	
	@Test
	public void testReverseStringNull() {
		assertEquals(null, ReverseString.reverse(null));
	}
	
	@Test
	public void testReverseStringSizeOne() {
		assertEquals("a", ReverseString.reverse("a"));
	}
	
	@Test
	public void testReverseStringSizeTwo() {
		assertEquals("ba", ReverseString.reverse("ab"));
	}
	
	@Test
	public void testReverseStringSizeTen() {
		assertEquals("jiHGfEdCba", ReverseString.reverse("abCdEfGHij"));
	}

}