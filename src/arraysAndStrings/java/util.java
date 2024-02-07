package arraysAndStrings.java;

import static java.lang.System.out;


public class util {
	private util(){}

	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.print("[");
			for(int j = 0; j < matrix[0].length; j++){
				out.printf(" %2d ", matrix[i][j]);
			}
			out.println("]");
		}
		out.println();
	}
}
