package by.htp.home07.main;

/*
 * 28. Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму. 
 * */

public class Task28 {

    public static void main(String[] args) {
	int n = 5;
	int matrix[][] = Utils.createMatrix(n, n, 10);
	Utils.printMatrix(matrix);

	int sumMax = 0;
	int sumMaxColumn = 0;

	for (int i = 0; i < n; i++) {

	    int sum = 0;
	    for (int j = 0; j < n; j++) {
		sum = sum + matrix[i][j];
	    }

	    System.out.println("Сумма элементов в " + i + " столбце: " + sum);
	    if (sum > sumMax) {
		sumMax = sum;
		sumMaxColumn = i;
	    }
	}

	System.out.println("Максимальная сумма содержится в " + sumMaxColumn + " столбце и составляет " + sumMax);
    }
}
