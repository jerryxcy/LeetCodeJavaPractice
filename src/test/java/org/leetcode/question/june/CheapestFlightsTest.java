package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheapestFlightsTest {

	@Test
	public void testMethod() {
		CheapestFlights test = new CheapestFlights();
		int out = test.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 0);
		assertEquals(500, out);
		out = test.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 1);
		assertEquals(200, out);		
		out = test.findCheapestPrice(5, new int[][] {{4,1,1},{1,2,3},{0,3,2},{0,4,10},{3,1,1},{1,4,3}}, 2, 1, 1);
		assertEquals(-1, out);

	}
}
