package org.leetcode.question.june;

public class ValidateIPAddress {

	public String validIPAddress(String IP) {
		if (IP == null || IP.length() == 0) {
			return "Neither";
		}
		
		if (isValidIPv4(IP)) {
			return "IPv4";
		}
		
		if (isValidIPv6(IP)) {
			return "IPv6";
		}
		
		return "Neither";
	}
	
	public boolean isValidIPv4(String IP) {
		String[] parts = IP.split("\\.");
		if (parts.length != 4) {
			return false;
		}
		if (IP.charAt(0) == '.' || IP.charAt(IP.length()-1) == '.') {
			return false;
		}
		for (int i = 0; i < parts.length; i++) {
			if (!isValidIPv4Segment(parts[i])) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidIPv4Segment(String part) {
		if (part == null || part.length() == 0 || part.length() > 3) {
			return false;
		}
		for (int i = 0; i < part.length(); i++) {
			if (!(part.charAt(i) >= '0' && part.charAt(i) <= '9')) {
				return false;
			}
		}
		int val = Integer.valueOf(part);
		if (val < 0 || val > 255 || (part.charAt(0) == '0' && part.length() > 1)) {
			return false;
		}
		return true;
	}
	
	public boolean isValidIPv6(String IP) {
		String[] parts = IP.split(":");
		if (parts.length != 8) return false;
		if (IP.charAt(0) == ':' || IP.charAt(IP.length()-1) == ':') {
			return false;
		}
		for (int i = 0; i < parts.length; i++) {
			if (!isValidIPv6Segment(parts[i])) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidIPv6Segment(String part) {
		if (part == null || part.length() == 0 || part.length() > 4) {
			return false;
		}
		for (int i = 0; i < part.length(); i++) {
			if (!((part.charAt(i) >= '0' && part.charAt(i) <= '9') ||
					(part.charAt(i) >= 'a' && part.charAt(i) <= 'f') ||
					(part.charAt(i) >= 'A' && part.charAt(i) <= 'F'))) {
				return false;
			}
		}
		return true;
	}
}
