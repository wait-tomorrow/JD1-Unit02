package by.htp.home07.main;

/*
 * 11. Дана матрица размера m x n. 
 * Вывести ее элементы в следующем порядке: первая строка справа налево, 
 * вторая строка слева направо, третья строка справа налево и так далее. 
 * */

public class Task11 {

    public static void main(String[] args) {
	int n = 5;
	int m = 6;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	System.out.println();
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {

		if (i % 2 == 0) {
		    System.out.print(matrix[i][j] + "  ");
		} else {
		    System.out.print(matrix[i][m - j - 1] + "  ");
		}
	    }

	    System.out.println();
	}
    }
}
