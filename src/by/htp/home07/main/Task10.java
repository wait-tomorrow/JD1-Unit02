package by.htp.home07.main;

/*10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class Task10 {

    public static void main(String[] args) {
	int n = 5;
	int m = 5;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	int row = 3;
	int column = 4;

	System.out.println("\nСтрока " + row);
	printRow(matrix, row);

	System.out.println("\nСтолбец " + column);
	printColumn(matrix, column);
    }

    public static void printRow(int[][] matrix, int row) {
	for (int i = 0; i < matrix[row].length; i++) {
	    System.out.print(matrix[row][i] + "  ");
	}

	System.out.println();
    }

    public static void printColumn(int[][] matrix, int column) {
	for (int i = 0; i < matrix.length; i++) {
	    System.out.print(matrix[i][column] + "  ");
	}
    }
}
