package LeetCodeJavaPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KDigitTest {

	@Test
	public void testMethod() {
		KDigit kdigit = new KDigit();
		assertEquals("200", kdigit.removeKdigits("10200", 1));
		assertEquals("0", kdigit.removeKdigits("10", 2));
		assertEquals("1219", kdigit.removeKdigits("1432219", 3));
		assertEquals("0", kdigit.removeKdigits("10", 1));
	}
}
