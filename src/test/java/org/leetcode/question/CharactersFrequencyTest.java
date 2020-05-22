package org.leetcode.question;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharactersFrequencyTest {

	@Test
	public void testMethod() {
		CharactersFrequency f = new CharactersFrequency();
		assertEquals("bbAa", f.frequencySort("Aabb"));
	}
}
