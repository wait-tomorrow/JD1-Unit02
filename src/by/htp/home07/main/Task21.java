package by.htp.home07.main;

/*
 * 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 *  n   0   0  ...   0   0   0
 * n-1  n   0  ...   0   0   0
 * n-2 n-1  n  ...   0   0   0
 * .    .   .  .     .   .   .
 * .    .   .   .    .   .   .
 * .    .   .    .   .   .   .
 * 2    3   4  ...  n-1  n   0
 * 1    2   3  ...  n-2 n-1  n
 * */

public class Task21 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j <= i; j++) {
		matrix[i][j] = n - (i - j);
	    }
	}

	Utils.printMatrix(matrix);
    }
}
