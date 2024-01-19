package arraysAndStrings.zeroMatrix;

public class Solution {
	static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.print("[");
			for(int j = 0; j < matrix[0].length; j++){
				System.out.printf(" %2d ", matrix[i][j]);
			}
			System.out.println("]");
		}
	}

	public static void main(String [] args){
		int[][] matrix = new int[][]{
				{1,2,3,4,5},
				{6,7,8,0,10},
				{11,12,13,14,15},
				{16,0,18,19,20},
				{21,22,23,24,25},
				{26,27,28,29,30}
		};

		printMatrix(matrix);
		recordZeroApproach ra = new recordZeroApproach();
		ra.zeroMatrix(matrix);
		System.out.println();
		printMatrix(matrix);


	}
}
