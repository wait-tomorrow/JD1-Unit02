package by.htp.home07.main;

/* 
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 
 * 
 * В java элементы массивов считаются с 0, а люди считают с 1. 
 * Поэтому будем выводить столбцы, которые для java считаются нечётными
 * */

public class Task06 {

    public static void main(String[] args) {
	int n = 4;
	int m = 5;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	for (int j = 0; j < m; j++) {
	    System.out.println();

	    for (int i = 0; i < n; i++) {

		if ((j + 1) % 2 == 0 && matrix[0][j] > matrix[n - 1][j]) {
		    System.out.print(matrix[i][j] + " ");
		}
	    }

	}
    }
}
