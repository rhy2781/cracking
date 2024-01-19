package arraysAndStrings.rotateMatrix;

public class indexApproach {
	public boolean rotate(int[][] matrix){
		if(matrix.length == 0 || matrix.length != matrix[0].length) return false;

		printMatrix(matrix);
		int n = matrix.length;
		for(int layer = 0; layer < n / 2; layer ++){
			int last = n - 1 - layer;
			for(int i = layer; i < last; i++){
				int offset = i - layer;

				int top = matrix[layer][i];

				// value of left gets assigned to top`
				matrix[layer][i] = matrix[last - offset][layer];
				printMatrix(matrix);

				// value of bottom gets assigned to the left spot
				matrix[last - offset][layer] = matrix[last][last - offset];
				printMatrix(matrix);

				// value of right gets assigned to bottom spot
				matrix[last][last - offset] = matrix[i][last];
				printMatrix(matrix);

				// value of top gets assigned to bottom
				matrix[i][last] = top;
				printMatrix(matrix);
			}
		}
		printMatrix(matrix);

		return true;
	}

	public void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.print("[");
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print("- " +matrix[i][j] + "- ");
			}
			System.out.println("]");
		}
		System.out.println();
	}
}
