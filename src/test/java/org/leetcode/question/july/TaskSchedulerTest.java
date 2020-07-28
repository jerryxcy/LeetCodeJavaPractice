package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskSchedulerTest {

	@Test
	public void testMethod() {
		TaskScheduler scheduler = new TaskScheduler();

		assertEquals(13, scheduler.leastInterval(new char[] {'A','A','A','A','B','B','B','E','E','F','F','G','G'}, 3));
		assertEquals(8, scheduler.leastInterval(new char[] {'A','C','C','C','E','E','E'}, 2));
		assertEquals(6, scheduler.leastInterval(new char[] {'A','A','A','B','B','B'}, 0));
		
	}
}
