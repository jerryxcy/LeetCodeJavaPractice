package LeetCodeJavaPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloodFillTest {
	@Test
	public void testFloodFill() {
		FloodFill floodFill = new FloodFill();
		int[][] image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
		int[][] final_image = floodFill.floodFill(image, 1, 1, 2);
		int[][] expected_image = new int[][] {{2,2,2},{2,2,0},{2,0,1}};
		int match_count = 0;
		for (int i = 0; i < expected_image.length; i++) {
			for (int j =0; j < expected_image[i].length; j++) {
				if (expected_image[i][j] == final_image[i][j]) {
					match_count += 1;
				}
			}
		}
		assertEquals(9, match_count);
		
		image = new int[][] {{0,0,0},{0,0,0}};
		final_image = floodFill.floodFill(image, 0, 0, 2);
		expected_image = new int[][] {{2,2,2},{2,2,2}};
		match_count = 0;
		for (int i = 0; i < expected_image.length; i++) {
			for (int j =0; j < expected_image[i].length; j++) {
				if (expected_image[i][j] == final_image[i][j]) {
					match_count += 1;
				}
			}
		}
		assertEquals(6, match_count);
		
		image = new int[][] {{0,0,0},{0,1,1}};
		final_image = floodFill.floodFill(image, 1, 1, 1);
		expected_image = new int[][] {{0,0,0},{0,1,1}};
		match_count = 0;
		for (int i = 0; i < expected_image.length; i++) {
			for (int j =0; j < expected_image[i].length; j++) {
				if (expected_image[i][j] == final_image[i][j]) {
					match_count += 1;
				}
			}
		}
		assertEquals(6, match_count);
	}
}
