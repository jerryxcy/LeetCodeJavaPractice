package org.leetcode.question.june;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateIPAddressTest {

	@Test
	public void testMethod() {
		ValidateIPAddress address = new ValidateIPAddress();
		assertEquals("Neither", address.validIPAddress("256.256.256.256"));
		assertEquals("IPv6", address.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
		assertEquals("IPv4", address.validIPAddress("172.16.254.1"));
		assertEquals("Neither", address.validIPAddress("12.12.12.12.12"));
		assertEquals("Neither", address.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
		assertEquals("Neither", address.validIPAddress("20EE:Fb8:85a3:0:0:8A2E:0370:7334:12"));

		
		
	}
}
