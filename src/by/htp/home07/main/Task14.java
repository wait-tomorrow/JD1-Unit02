package by.htp.home07.main;

/*
 * 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 0  0  0 ... 0 0 1
 * 0  0  0 ... 0 2 0
 * 0  0  0 ... 3 0 0
 * .  .  . .   . . .
 * .  .  .  .  . . .
 * .  .  .   . . . .
 * 0 n-1 0 ... 0 0 0
 * n  0  0 ... 0 0 0
 * */

public class Task14 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    matrix[i][n - i - 1] = i + 1;
	}

	Utils.printMatrix(matrix);
    }
}
