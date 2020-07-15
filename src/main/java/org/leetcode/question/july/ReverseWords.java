package org.leetcode.question.july;

//Reverse Words in a String
public class ReverseWords {

	public String reverseWords(String s) {
		
		String[] token = s.trim().split("\\s+", -1);
		StringBuilder sb = new StringBuilder();
		for (int i = token.length-1; i >=0; i--) {
			sb.append(token[i]);
			if (i > 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
}
