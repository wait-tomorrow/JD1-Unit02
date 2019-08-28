package by.htp.home07.main;

/*32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Task32 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(6, 5, 10);
	Utils.printMatrix(matrix);

	System.out.println("\nСортировка строк по убыванию:");
	sortDescending(matrix);
	Utils.printMatrix(matrix);

	System.out.println("\nСортировка строк по возрастанию:");
	sortAscending(matrix);
	Utils.printMatrix(matrix);
    }

    public static void sortDescending(int matrix[][]) {
	for (int i = 0; i < matrix.length; i++) {
	    boolean oneMore = true;

	    while (oneMore) {
		oneMore = false;

		for (int j = 0; j < matrix[i].length - 1; j++) {
		    if (matrix[i][j] < matrix[i][j + 1]) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[i][j + 1];
			matrix[i][j + 1] = temp;

			oneMore = true;
		    }
		}
	    }
	}
    }

    public static void sortAscending(int matrix[][]) {
	for (int i = 0; i < matrix.length; i++) {
	    boolean oneMore = true;

	    while (oneMore) {
		oneMore = false;

		for (int j = 0; j < matrix[i].length - 1; j++) {
		    if (matrix[i][j] > matrix[i][j + 1]) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[i][j + 1];
			matrix[i][j + 1] = temp;

			oneMore = true;
		    }
		}
	    }
	}
    }
}
