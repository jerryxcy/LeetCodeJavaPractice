package org.leetcode.question.june;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		//use bitwise
		//e.g. 1: 1, 2:10, 4:100, 8:1000
		//in binary formati, only has one 1's.
		//and about (n & (-n)) == n, e.g.
		//8: 01000
		//-8:11000
		//so 8 & -8 = 8
		return (n > 0) && ((n & (-n)) == n);
	}
	
	public boolean isPowerOfTwoSolution2(int n) {
		if (n == 1) {
			return true;
		}
		if (n <= 0) {
			return false;
		}
		boolean result = false;
		int remaider = 0;
		while (n > 1) {
			remaider = n % 2;
			if (remaider != 0) {
				result = false;
				break;
			}
			n = n / 2;
			if (n == 1 && remaider == 0) {
				result = true;
				break;
			}
		}
		return result;
	}
}
