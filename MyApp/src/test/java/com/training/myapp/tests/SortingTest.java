package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Sorting;

public class SortingTest {

	@Test
	public void testSortingInDescendingOrder() 
	{
		assartEquals(new int[]{3,2,1}, Sorting.descendingOrder(new int[] {1,2,3}));
	}

}
