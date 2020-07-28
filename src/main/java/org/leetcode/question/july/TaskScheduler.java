package org.leetcode.question.july;

import java.util.Arrays;

//Task Scheduler
public class TaskScheduler {

	public int leastInterval(char[] tasks, int n) {
		int[] count = new int[26];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		for (char task: tasks) {
			++count[task - 'A'];
		}
		Arrays.sort(count);
		int i = 25, max = count[25], len = tasks.length;
		while (i >=0 && count[i] == max) --i;
		return Math.max(len, (max - 1) * (n + 1) + 25 - i);
	}

}
