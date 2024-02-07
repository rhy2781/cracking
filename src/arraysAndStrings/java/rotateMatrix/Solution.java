package arraysAndStrings.java.rotateMatrix;

import arraysAndStrings.java.util;

public class Solution {
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};

		util.printMatrix(matrix);
		rotate(matrix);
		util.printMatrix(matrix);
	}

	public static boolean rotate(int[][] matrix){
		if(matrix.length == 0 || matrix.length != matrix[0].length) return false;

		int n = matrix.length;
		for(int layer = 0; layer < n / 2; layer ++){
			int last = n - 1 - layer;
			for(int i = layer; i < last; i++){
				int offset = i - layer;

				int top = matrix[layer][i];

				// value of left gets assigned to top`
				matrix[layer][i] = matrix[last - offset][layer];

				// value of bottom gets assigned to the left spot
				matrix[last - offset][layer] = matrix[last][last - offset];

				// value of right gets assigned to bottom spot
				matrix[last][last - offset] = matrix[i][last];

				// value of top gets assigned to bottom
				matrix[i][last] = top;
			}
		}
		return true;
	}
}
