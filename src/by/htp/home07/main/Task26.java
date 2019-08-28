package by.htp.home07.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 26. С клавиатуры вводится двумерный массив чисел размерностью NxM. 
 * Выполнить с массивом следующие действия:  
 * а) вычислить сумму отрицательных элементов в каждой строке;  
 * б) определить максимальный элемент в каждой строке;  
 * в) переставить местами максимальный и минимальный элементы матрицы. 
 * */

public class Task26 {

    public static void main(String[] args) {
	int n = 3;
	int m = 4;
	int matrix[][] = new int[n][m];
	// int matrix[][] = Utils.createMatrixWithNegativeNumbers(n, m, 10);
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] = sc.nextInt();
	    }
	}

	Utils.printMatrix(matrix);

	printSummNegativeElem(matrix);

	swapMinMaxInEveryLine(matrix);
	Utils.printMatrix(matrix);

	sc.close();
    }

    public static void printSummNegativeElem(int matrix[][]) {
	System.out.println("-----");

	for (int i = 0; i < matrix.length; i++) {
	    int sum = 0;
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] < 0) {
		    sum = sum + matrix[i][j];
		}
	    }

	    System.out.println("Сумма отрицательных элементов в " + i + " строке: " + sum);
	}
    }

    public static void swapMinMaxInEveryLine(int matrix[][]) {
	System.out.println("----------");
	for (int i = 0; i < matrix.length; i++) {
	    int minIndex = 0;
	    int maxIndex = 0;

	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] > matrix[i][maxIndex]) {
		    maxIndex = j;
		}

		if (matrix[i][j] < matrix[i][minIndex]) {
		    minIndex = j;
		}
	    }

	    System.out.println("Максимальный элемент в строке: " + matrix[i][maxIndex]);

	    int temp = matrix[i][maxIndex];
	    matrix[i][maxIndex] = matrix[i][minIndex];
	    matrix[i][minIndex] = temp;
	}
    }
}
