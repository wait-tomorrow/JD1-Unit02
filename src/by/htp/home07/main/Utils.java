package by.htp.home07.main;

import java.util.Random;

public class Utils {

    public static void printMatrix(int[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		//System.out.print(matrix[i][j] + " | ");
		System.out.printf("%4d", matrix[i][j]);
	    }
	    System.out.println();
	}
    }
    
    public static void printMatrix(double[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.printf("%7.3f ", matrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public static int[][] createMatrix(int n, int m, int limit) {
	int matrix[][] = new int[n][m];
	Random random = new Random();

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] = random.nextInt(limit + 1);
	    }
	}

	return matrix;
    }

    public static int[][] createMatrixWithNegativeNumbers(int n, int m, int limit) {
	int matrix[][] = new int[n][m];
	Random random = new Random();

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] = random.nextInt(limit + 1);

		if (Math.random() > 0.5) {
		    matrix[i][j] = -1 * matrix[i][j];
		}
	    }
	}

	return matrix;
    }

}
