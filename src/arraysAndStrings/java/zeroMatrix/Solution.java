package arraysAndStrings.java.zeroMatrix;

import arraysAndStrings.java.util;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String [] args){
		int[][] matrix = new int[][]{
				{1,2,3,4,5},
				{6,7,8,0,10},
				{11,12,13,14,15},
				{16,0,18,19,20},
				{21,22,23,24,25},
				{26,27,28,29,30}
		};

		util.printMatrix(matrix);
		zeroMatrix(matrix);
		util.printMatrix(matrix);
	}

	public static void setRow(int[][] matrix, int row){
		for(int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	public static void setCol(int[][] matrix, int col){
		for(int i = 0; i < matrix.length; i++){
			matrix[i][col] = 0;
		}
	}

	public static void zeroMatrix(int[][] matrix){
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
