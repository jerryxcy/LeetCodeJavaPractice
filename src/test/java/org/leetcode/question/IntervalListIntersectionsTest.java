package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class IntervalListIntersectionsTest {

	@Test
	public void testMethod() {
		IntervalListIntersections intersection = new IntervalListIntersections();
		//A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
		int[][] result = intersection.intervalIntersection(new int[][] {{0,2}, {5,10}, {13, 23}, {24,25}}, new int[][] {{1,5},{8,12},{15,24},{25,26}});
		//[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
		int[][] expectedResult = new int[][]{{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};
		assertEquals(expectedResult.length, result.length);
		for (int i = 0 ; i < result.length; i++) {
			assertEquals(true, Arrays.equals(result[i], expectedResult[i]));
		}
	}
}
