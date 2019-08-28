package by.htp.home07.main;

/*
 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * 
 * */

public class Task13 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {

		if (i % 2 == 0) {
		    matrix[i][j] = j + 1;
		} else {
		    matrix[i][j] = n - j;
		}
	    }
	}

	Utils.printMatrix(matrix);
    }
}
