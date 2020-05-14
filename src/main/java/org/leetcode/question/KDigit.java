package org.leetcode.question;

import java.util.Stack;

public class KDigit {
	
	public String removeKdigits(String num, int k) {
		
		int reservedDigits = num.length() - k;
		if (reservedDigits == 0) {
			return "0";
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0 ; i < num.length(); i++) {
			char charactor = num.charAt(i);
			while ( k > 0 && stack.size() > 0 && Character.getNumericValue(stack.peek()) > Character.getNumericValue(charactor)) {
				stack.pop();
				k--;
			} 
			stack.add(num.charAt(i));
		}
		//increasing order. We will delete from the last digit. e.g. 1234
		while (k > 0) {
			stack.pop();
			k--;
		}
		StringBuilder s = new StringBuilder();
		for (int i = 0 ; i < stack.size(); i++) {
			if (s.length() == 0 && Character.getNumericValue(stack.get(i)) == 0) { 
				//preceding 0
				continue;
			} 
			s.append(stack.get(i));
		}
		if (s.toString().equals("")) {
			s.append("0");
		}
		return s.toString();
	}
}
