package org.leetcode.question.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainsDuplicateIIITest {

	@Test
	public void testContainsNearbyAlmostDuplicate() {
		 ContainsDuplicateIII test = new  ContainsDuplicateIII();
		 
		 assertEquals(true, test.containsNearbyAlmostDuplicate(new int[] {1,2,3,1}, 3, 0));
		 assertEquals(true, test.containsNearbyAlmostDuplicate(new int[] {1,0,1,1}, 1, 2));
		 assertEquals(false, test.containsNearbyAlmostDuplicate(new int[] {1,5,9,1,5,9}, 2, 3));
		 assertEquals(false, test.containsNearbyAlmostDuplicate(new int[] {2147483647,-1,2147483647}, 1, 2147483647));
	}
}
