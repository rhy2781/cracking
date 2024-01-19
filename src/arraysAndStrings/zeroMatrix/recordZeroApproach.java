package arraysAndStrings.zeroMatrix;

import java.util.HashSet;
import java.util.Set;

public class recordZeroApproach {

	public void setRow(int[][] matrix, int row){
		for(int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	public void setCol(int[][] matrix, int col){
		for(int i = 0; i < matrix.length; i++){
			matrix[i][col] = 0;
		}
	}

	public void zeroMatrix(int[][] matrix){
		Set<Integer> row = new HashSet<>();
		Set<Integer> col = new HashSet<>();

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row.add(i);
					col.add(j);
				}
			}
		}
		for(int r: row) setRow(matrix, r);
		for(int c: col) setCol(matrix, c);
	}
}
