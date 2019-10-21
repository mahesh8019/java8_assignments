package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Printhello;

public class HelloTest {

	@Test
	public void testPrintHelloWorld() 
	{
		assertEquals("Hello World", Printhello.greeting("Hello World"));
	}
}


