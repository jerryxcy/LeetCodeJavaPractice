package LeetCodeJavaPractice;

public class FloodFill {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int initialColor = image[sr][sc];
        if (image[sr][sc] == newColor) {
        	return image;
        }
		image[sr][sc] = newColor;
        if (sr > 0 && image[sr-1][sc] == initialColor) {
        	floodFill(image, sr-1, sc, newColor);
        }
        if (sc > 0 && image[sr][sc-1] == initialColor) {
        	floodFill(image, sr, sc-1, newColor);
        }
        if (sr < image.length-1 && image[sr+1][sc] == initialColor) {
        	floodFill(image, sr+1, sc, newColor);
        }
        if (sc < image[0].length-1 && image[sr][sc+1] == initialColor) {
        	floodFill(image, sr, sc+1, newColor);
        }
        return image;
    }
}
