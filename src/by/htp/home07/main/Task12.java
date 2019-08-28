package by.htp.home07.main;

/*
 * 12. Получить квадратную матрицу порядка n: 
 * 0 0 0 0
 * 0 1 0 0
 * 0 0 2 0
 * 0 0 0 3
 * 
 * */

public class Task12 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    matrix[i][i] = i;
	}

	Utils.printMatrix(matrix);
    }
}
