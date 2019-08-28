package by.htp.home07.main;

/*29. Найти положительные элементы главной диагонали квадратной матрицы. */

public class Task29 {

    public static void main(String[] args) {
	int n = 5;
	int matrix[][] = Utils.createMatrixWithNegativeNumbers(n, n, 10);
	Utils.printMatrix(matrix);

	System.out.println("\nПоложительные элементы главной диагонали: ");
	for (int i = 0; i < n; i++) {
	    if (matrix[i][i] > 0) {
		System.out.print(matrix[i][i] + ", ");
	    }
	}
    }
}
