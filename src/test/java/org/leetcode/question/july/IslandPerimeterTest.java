package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IslandPerimeterTest {

	@Test
	public void testMethod() {
		IslandPerimeter p = new IslandPerimeter();
		assertEquals(16, p.islandPerimeter(new int[][] {{0,1,0,0},
			 {1,1,1,0},
			 {0,1,0,0},
			 {1,1,0,0}}));
	}
}
