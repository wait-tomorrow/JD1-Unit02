package by.htp.home07.main;

/*
 * 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 *  1    1   1  ... 1  1  1
 *  2    2   2  ... 2  2  0
 *  3    3   3  ... 3  0  0
 *  .    .   .  .   .  .  .
 *  .    .   .   .  .  .  .
 *  .    .   .    . .  .  .
 * n-1  n-1  0  ... 0  0  0
 *  n    0   0  ... 0  0  0
 * */

public class Task18 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j <= n - i - 1; j++) {
		matrix[i][j] = i + 1;
	    }
	}

	Utils.printMatrix(matrix);
    }
}
