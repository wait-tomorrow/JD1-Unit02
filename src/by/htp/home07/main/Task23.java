package by.htp.home07.main;

/*23. Сформировать квадратную матрицу порядка N по правилу:  
 * A[I,J] = sin((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней. */

public class Task23 {

    public static void main(String[] args) {
	int n = 4;
	double matrix[][] = new double[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = Math.sin((i * i - j * j) / ((double) n));
	    }
	}

	int countPositiveElem = 0;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		if (matrix[i][j] > 0) {
		    countPositiveElem++;
		}
	    }
	}

	Utils.printMatrix(matrix);
	System.out.println("\nКоличество положительных элементов: " + countPositiveElem);
    }
}
