package org.leetcode.question.july;

public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) return 0;
		
		int m = grid.length;
		int n = grid[0].length;
		int perimeter = 0;
		for (int i = 0 ; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 0) continue;
				//left
				if (j == 0 || grid[i][j-1] != 1) perimeter++;
				//right
				if (j == n - 1 || grid[i][j+1] != 1) perimeter++;
				//top
				if (i == 0 || grid[i-1][j] != 1) perimeter++;
				//bottom
				if (i == m-1 || grid[i+1][j] != 1) perimeter++;
			}
		}
		return perimeter;
	}
	
}
