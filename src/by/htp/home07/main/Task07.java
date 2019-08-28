package by.htp.home07.main;

/*7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. */

public class Task07 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrixWithNegativeNumbers(5, 5, 10);
	Utils.printMatrix(matrix);

	int sum = 0;
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 5; j++) {

		if (matrix[i][j] < 0 && matrix[i][j] % 2 != 0) {
		    sum = sum + Math.abs(matrix[i][j]);
		}
	    }
	}

	System.out.println("\nСумма модулей отрицательных элементов: "+sum);
    }
}
