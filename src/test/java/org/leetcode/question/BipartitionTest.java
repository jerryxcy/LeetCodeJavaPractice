package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BipartitionTest {

	
	@Test
	public void testMethod() {
		Bipartition bi = new Bipartition();
		assertEquals(true, bi.possibleBipartition(4,  new int[][] {{1,2},{1,3},{2,4}}));
		assertEquals(false, bi.possibleBipartition(3,  new int[][] {{1,2},{1,3},{2,3}}));
		assertEquals(false, bi.possibleBipartition(5,  new int[][] {{1,2},{2,3},{3,4},{4,5},{1,5}}));
	}
}
