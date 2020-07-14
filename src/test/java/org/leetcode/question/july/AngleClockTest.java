package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AngleClockTest {

	@Test
	public void testMethod() {
		AngleClock clock = new AngleClock();
		assertEquals(7.5, clock.angleClock(3, 15), 0.00001);
		assertEquals(155, clock.angleClock(4, 50), 0.00001);
		assertEquals(0, clock.angleClock(12, 0), 0.00001);
	}
}
