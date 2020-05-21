package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareSubmatricesTest {

	@Test
	public void testMethod() {
		SquareSubmatrices matrices = new SquareSubmatrices();
		int[][] matrix = new int[][] {
			{0,1,1,1},
			{1,1,1,1},
			{0,1,1,1}
		};
		assertEquals(15, matrices.countSquares(matrix));
	}
}
