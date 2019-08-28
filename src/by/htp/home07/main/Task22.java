package by.htp.home07.main;

/*
 * 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 *  1   2   3  ...  n-2 n-1  n
 *  2   3   4  ...  n-1  n   0
 *  3   4   5  ...   n   0   0
 *  .   .   .  .     .   .   .
 *  .   .   .   .    .   .   .
 *  .   .   .    .   .   .   .
 * n-1  n   0  ...   0   0   0
 *  n   0   0  ...   0   0   0
 * */

public class Task22 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n - i; j++) {
		matrix[i][j] = i + j + 1;
	    }
	}

	Utils.printMatrix(matrix);
    }
}
