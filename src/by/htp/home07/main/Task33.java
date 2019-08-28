package by.htp.home07.main;

/*33. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.*/

public class Task33 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(5, 6, 10);
	Utils.printMatrix(matrix);

	System.out.println("\nСортировка столбцов по убыванию:");
	sortDescending(matrix);
	Utils.printMatrix(matrix);

	System.out.println("\nСортировка столбцов по возрастанию:");
	sortAscending(matrix);
	Utils.printMatrix(matrix);
    }

    public static void sortDescending(int matrix[][]) {
	for (int i = 0; i < matrix[0].length; i++) {
	    boolean oneMore = true;

	    while (oneMore) {
		oneMore = false;

		for (int j = 0; j < matrix.length - 1; j++) {
		    if (matrix[j][i] < matrix[j + 1][i]) {
			int temp = matrix[j][i];
			matrix[j][i] = matrix[j + 1][i];
			matrix[j + 1][i] = temp;

			oneMore = true;
		    }
		}
	    }
	}
    }

    public static void sortAscending(int matrix[][]) {
	for (int i = 0; i < matrix[0].length; i++) {
	    boolean oneMore = true;

	    while (oneMore) {
		oneMore = false;

		for (int j = 0; j < matrix.length - 1; j++) {
		    if (matrix[j][i] > matrix[j + 1][i]) {
			int temp = matrix[j][i];
			matrix[j][i] = matrix[j + 1][i];
			matrix[j + 1][i] = temp;

			oneMore = true;
		    }
		}
	    }
	}
    }
}
