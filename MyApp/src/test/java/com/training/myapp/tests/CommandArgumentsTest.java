package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.CommandArguments;

public class CommandArgumentsTest {

	@Test
	public void testCommandLine()
	{
		assertArrayEquals(new int[]{2,4,6,8}, CommandArguments.argument(new int[]{2,4,6,8}));
	}

}
