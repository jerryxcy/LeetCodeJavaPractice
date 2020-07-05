package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HammingDistanceTest {

	@Test
	public void testMethod() {
		HammingDistance distance = new HammingDistance();
		assertEquals(2, distance.hammingDistance(1, 4));
	}
}
