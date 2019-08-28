package by.htp.home07.main;

/*
 * 24. Дан линейный массив x1, x2, ..., xn-1, xn 
 * Получить действительную квадратную матрицу порядка n: 
 * 
 *  x1   x2   x3  ...  xn
 * x1^2 x2^2 x3^2 ... xn^2
 * x1^3 x2^3 x3^3 ... xn^3
 *   .    .    .  .    .
 *   .    .    .   .   .
 *   .    .    .    .  .
 * x1^n x2^n x3^n ... xn^n
 * 
 * */

public class Task24 {

    public static void main(String[] args) {
	int a[] = { 2, 2, 2, 2, 2, 2 };
	int n = a.length;

	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = (int) Math.pow(a[j], i + 1);
	    }
	}

	Utils.printMatrix(matrix);
    }
}
