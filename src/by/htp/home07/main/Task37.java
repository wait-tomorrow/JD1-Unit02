package by.htp.home07.main;

import java.util.Random;

/*37. Переставить строки матрицы случайным образом. */

public class Task37 {

    public static void main(String[] args) {
	int n = 5;
	int matrix[][] = Utils.createMatrix(n, n, 10);
	Utils.printMatrix(matrix);

	Random random = new Random();
	int row1 = random.nextInt(n);
	int row2 = random.nextInt(n);

	System.out.printf("Меняем местами %d и %d строки матрицы\n", row1 + 1, row2 + 1);

	swapRows(matrix, row1, row2);

	System.out.println("\nИзменённая матрица: ");
	Utils.printMatrix(matrix);
    }

    public static void swapRows(int matrix[][], int row1, int row2) {
	int a[] = matrix[row1].clone();
	matrix[row1] = matrix[row2].clone();
	matrix[row2] = a;
    }
}
