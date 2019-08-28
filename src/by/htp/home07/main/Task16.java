package by.htp.home07.main;

/*
 * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1*2   0    0  ...   0     0     0
 * 0    2*3   0  ...   0     0     0
 * 0     0   3*4 ...   0     0     0
 * .     .    .  .     .     .     .
 * .     .    .   .    .     .     .
 * .     .    .    .   .     .     .
 * 0     0    0  ...   0   n(n-1)  0
 * 0     0    0  ...   0     0   n(n+1)
 * */

public class Task16 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < matrix.length; i++) {
	    matrix[i][i] = (i + 1) * (i + 2);
	}

	Utils.printMatrix(matrix);
    }
}
