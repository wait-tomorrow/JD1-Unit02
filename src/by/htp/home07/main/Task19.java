package by.htp.home07.main;

/*
 * 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * . . . .   . . .
 * . . .  .  . . .
 * . . .   . . . .
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1
 * */

public class Task19 {

    public static void main(String[] args) {
	int n = 8;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		if ((j < n - i && j >= i) || (j >= n - i - 1 && j <= i)) {
		    matrix[i][j] = 1;
		}
	    }
	}

	Utils.printMatrix(matrix);
    }
}
