package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class QueueReconstructionTest {

	@Test
	public void testMethod() {
		QueueReconstruction qr = new QueueReconstruction();
		int[][] finalQueue = qr.reconstructQueue(new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}});
		assertEquals(true, Arrays.deepEquals(finalQueue, new int[][] {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}}));
	}


}
