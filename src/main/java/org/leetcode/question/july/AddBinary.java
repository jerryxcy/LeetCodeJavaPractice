package org.leetcode.question.july;

public class AddBinary {

	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int aValue = 0;
			int bValue = 0;
			if (i >= 0) {
				aValue = a.charAt(i) - '0';
			}
			if (j >= 0) {
				bValue = b.charAt(j) - '0';
			}
			int sum = aValue + bValue + carry;
			sb.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

}
