package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseScheduleTest {

	@Test
	public void testMethod() {
		
		CourseSchedule schedule = new CourseSchedule();
		assertEquals(true, schedule.canFinish(2, new int[][] {{1,0}}));
		assertEquals(false, schedule.canFinish(2, new int[][] {{1,0},{0,1}}));
		assertEquals(false, schedule.canFinish(8, new int[][] {{1,0},{2,6},{1,7},{5,1},{6,4},{7,0},{0,5}}));
		assertEquals(true, schedule.canFinish(8, new int[][] {{1,0},{2,6},{1,7},{6,4},{7,0},{0,5}}));
	}
}
