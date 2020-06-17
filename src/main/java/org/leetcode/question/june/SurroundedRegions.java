package org.leetcode.question.june;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

	public void solve(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) return;
		int m = board.length;
		int n = board[0].length;
		for (int i = 0 ; i < m; i++) {
			for (int j = 0 ; j < n; j++) {
				if (i != 0 && i!= m-1 && j != 0 && j != n-1) { 
					continue;
				}
				if (board[i][j] != 'O') {
					continue;
				}
				//use BFS to change 'O' to other character from boarder 
				board[i][j] = 'P';
				Queue<Integer> queue = new LinkedList<>();
				queue.offer(i*n + j);
				while (!queue.isEmpty()) {
					int head = queue.peek();
					int x = head / n;
					int y = head % n;
					queue.poll();
					if (x >= 1 && board[x-1][y] == 'O') {
						board[x-1][y] = 'P';
						queue.offer(head - n);
					}
					if (x < m-1 && board[x+1][y] == 'O') {
						board[x+1][y] = 'P';
						queue.offer(head + n);
					}
					if (y >= 1 && board[x][y-1] == 'O') {
						board[x][y-1] = 'P';
						queue.offer(head - 1);
					}
					if (y < n-1 && board[x][y+1] == 'O') {
						board[x][y+1] = 'P';
						queue.offer(head + 1);
					}
				}
				
			}
		}
		
		for (int i = 0 ; i < m; i++) {
			for (int j = 0 ; j < n; j++) {
				if (board[i][j] == 'P') {
					board[i][j] = 'O';
				} else if (board[i][j] == 'O') {
					board[i][j] = 'X';
				}
			}
		}
		
	}

}
