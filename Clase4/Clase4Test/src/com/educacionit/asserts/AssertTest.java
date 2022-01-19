package com.educacionit.asserts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AssertTest {
	
	// JUnit Assert
	
	//Boolean
	
	// assertTrue(condition)
	// assertFalse(condition)
	
	// Objeto Null
	
	// assertNull(objeto)
	// assertNotNull(objeto)
	
	//objeto identicos
	
	// assertSame(expected, actual)
	// assertNotSame(expected, actual)
	
	// equal
	// assertEquals(expected, actual)
	
	// Array equal
	// assertArrayEquals(expected, actual)
	
	@Test	
	public void test() {
		String st1 = "hola";
		String st2 = "hola";
		
		assertEquals(st1, st2);
	}

}
