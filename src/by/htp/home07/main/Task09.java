package by.htp.home07.main;

/*9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

public class Task09 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = Utils.createMatrix(n, n, 10);
	Utils.printMatrix(matrix);

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {

		if (i == j) {
		    System.out.print(matrix[i][j] + "  ");
		}
	    }
	}
    }
}
