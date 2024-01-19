package arraysAndStrings.rotateMatrix;

public class Solution {
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};

		indexApproach ia = new indexApproach();
		ia.rotate(matrix);
	}
}
