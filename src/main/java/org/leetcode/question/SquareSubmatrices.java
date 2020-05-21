package org.leetcode.question;

//Count Square Submatrices with All Ones
public class SquareSubmatrices {
	public int countSquares(int[][] matrix) {
		//count prefix sum
		int[][] prefixSumRow = new int[matrix.length][matrix[0].length];
		int[][] prefixSumCol = new int[matrix.length][matrix[0].length];
		for (int r = 0 ; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				if (c == 0) {
					prefixSumRow[r][c] = matrix[r][c];
				} else {
					prefixSumRow[r][c] = prefixSumRow[r][c-1] + matrix[r][c];
				}
			}
		}
		
		for (int c = 0; c < matrix[0].length; c++) {
			for (int r = 0 ; r < matrix.length; r++) {
				if (r == 0) {
					prefixSumCol[r][c] = matrix[r][c];
				} else {
					prefixSumCol[r][c] = prefixSumCol[r-1][c] + matrix[r][c];
				}
			}
		}
		
		int result = 0;
		for (int r = 0 ; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				if (matrix[r][c] == 0) {
					continue;
				}
				result++;
				for (int k = 1; (r+k < matrix.length) && (c+k < matrix[0].length) ; k++) {
					int rowDiff = prefixSumRow[r+k][c+k] - (c == 0? 0:prefixSumRow[r+k][c-1]);
					if (rowDiff != k+1) {
						break;
					}
					int colDiff = prefixSumCol[r+k][c+k] - (r == 0? 0:prefixSumCol[r-1][c+k]);
					if (colDiff != k+1) {
						break;
					}
					result += 1;
				}
			}
		}
		return result;
	}
}
