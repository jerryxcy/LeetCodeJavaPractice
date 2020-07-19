package org.leetcode.question.july;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CourseScheduleIITest {

	@Test
	public void testMethod() {
		CourseScheduleII course = new CourseScheduleII();
		int[] result = course.findOrder(2, new int[][] {{1,0}});
		System.out.println(Arrays.toString(result));
		assertEquals(true, Arrays.equals(new int[] {0, 1}, result));
	}
}
