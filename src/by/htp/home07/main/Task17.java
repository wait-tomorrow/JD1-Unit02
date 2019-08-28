package by.htp.home07.main;

/*
 * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1  1  1 ... 1  1  1
 * 1  0  0 ... 0  0  1
 * 1  0  0 ... 0  0  1
 * .  .  . .   .  .  .
 * .  .  .  .  .  .  .
 * .  .  .   . .  .  .
 * 1  0  0 ... 0  0  1
 * 1  1  1 ... 1  1  1
 * */

public class Task17 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		if ((i == 0 || i == n - 1) || (j == 0 || j == n - 1)) {
		    matrix[i][j] = 1;
		}
	    }
	}

	Utils.printMatrix(matrix);
    }
}
