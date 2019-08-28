package by.htp.home07.main;

/*35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. */

public class Task35 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(4, 4, 100);
	Utils.printMatrix(matrix);

	int maxElem = 0;
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] > maxElem) {
		    maxElem = matrix[i][j];
		}
	    }
	}

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if ((matrix[i][j] % 2) != 0) {
		    matrix[i][j] = maxElem;
		}
	    }
	}

	System.out.println("\nНаибольший элемент: " + maxElem);
	System.out.println("Изменённая матрица: ");
	Utils.printMatrix(matrix);
    }
}
