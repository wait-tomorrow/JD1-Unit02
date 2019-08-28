package by.htp.home07.main;

/*
 * 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * n   0   0  ...  0   0   0
 * 0  n-1  0  ...  0   0   0
 * 0   0  n-2 ...  0   0   0
 * .   .   .  .    .   .   .
 * .   .   .   .   .   .   .
 * .   .   .    .  .   .   .
 * 0   0   0  ...  0   2   0
 * 0   0   0  ...  0   0   1
 * */

public class Task15 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    matrix[n - i - 1][n - i - 1] = i + 1;
	}

	Utils.printMatrix(matrix);
    }
}
