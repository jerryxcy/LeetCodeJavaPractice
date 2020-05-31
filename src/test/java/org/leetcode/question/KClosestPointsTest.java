package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KClosestPointsTest {

	@Test
	public void testMethod() {
		KClosestPoints kclosest = new KClosestPoints();
		int[][] result = kclosest.kClosest(new int[][] {{3,3}, {5, -1}, {-2,4}}, 2);
		assertEquals(2, result.length);
		for (int i = 0 ; i < result.length; i++) {
			if ((result[i][0] == 3 && result[i][1] == 3) ||
					((result[i][0] == -2 && result[i][1] == 4))) {
				assertEquals(true, true);
			} else {
				assertEquals(false, true);
			}
			
		}
	}
}
