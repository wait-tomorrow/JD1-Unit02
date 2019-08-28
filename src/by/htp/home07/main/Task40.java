package by.htp.home07.main;

import java.util.Random;

/*
 * 40. Магическим квадратом порядка n называется квадратная матрица размера N x N, 
 * составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат. 
 * Пример магического квадрата порядка 3:
 * 
 *  6 1 8
 *  7 5 3
 *  2 9 4
 *  
 *  Формула суммы строки магического квадрата:
 *  n(n^2+1)/2
 * */

public class Task40 {

    private static int n = 4;
    private static int magicSum = n * (n * n + 1) / 2;

    public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
	int matrix[][] = new int[n][n];

	System.out.println("Магическая сумма: " + magicSum);

	fillSquare(matrix);
	Utils.printMatrix(matrix);

	System.out.println("=================");

	generateMagicSquare(matrix);
	Utils.printMatrix(matrix);

	System.out.println("Время выполнения (мс): " + (System.currentTimeMillis() - startTime));
    }

    public static void fillSquare(int matrix[][]) {
	int number = 1;
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		matrix[i][j] = number;
		number++;
	    }
	}
    }

    public static void generateMagicSquare(int matrix[][]) {
	boolean isMagicSquare = false;
	Random rand = new Random();
	boolean allowedRows[] = createBooleanArray();
	boolean allowedColumns[] = createBooleanArray();
	int attempt = 0;
	int maxAttempt = (int) Math.pow(n, n);

	while (!isMagicSquare) {

	    // перед запуском необходимо совершить жертвоприношение Богу Рандома :D
	    // а если без шуток, то...
	    // n=3 - 30-40 мс
	    // n=4 - 60-300 мс
	    // n=5 - 30-40 c
	    int i1 = rand.nextInt(n);
	    int j1 = rand.nextInt(n);
	    int i2 = rand.nextInt(n);
	    int j2 = rand.nextInt(n);

	    if (allowedRows[i1] && allowedRows[i2] && allowedColumns[j1] && allowedColumns[j2]) {
		swap(matrix, i1, j1, i2, j2);

		checkAvailableRows(matrix, allowedRows);
		checkAvailableColumns(matrix, allowedColumns);

		if (checkSquare(matrix)) {
		    isMagicSquare = true;
		}
	    } else {
		attempt++;
		if (attempt > maxAttempt) {
		    allowedRows = createBooleanArray();
		    allowedColumns = createBooleanArray();
		    attempt = 0;
		}
	    }
	}
    }

    public static void checkAvailableRows(int matrix[][], boolean a[]) {
	for (int i = 0; i < matrix.length - 2; i++) {
	    if (calculateRowSum(matrix, i) == magicSum) {
		a[i] = false;
	    } else {
		a[i] = true;
		break;
	    }
	}
    }

    public static void checkAvailableColumns(int matrix[][], boolean a[]) {
	for (int i = 0; i < matrix.length - 2; i++) {
	    if (calculateColumnSum(matrix, i) == magicSum) {
		a[i] = false;
	    } else {
		a[i] = true;
		break;
	    }
	}
    }

    public static void swap(int matrix[][], int i1, int j1, int i2, int j2) {
	int temp = matrix[i1][j1];
	matrix[i1][j1] = matrix[i2][j2];
	matrix[i2][j2] = temp;
    }

    public static boolean checkSquare(int matrix[][]) {

	if (calculateRowSum(matrix, 0) != magicSum) {
	    return false;
	}

	if (calculateDiagonalSum(matrix) == magicSum && calculateBackDiagonalSum(matrix) == magicSum) {
	    if (checkRows(matrix) && checkColumns(matrix)) {
		return true;
	    }
	} else {
	    return false;
	}

	return false;
    }

    public static boolean checkRows(int matrix[][]) {

	for (int i = 0; i < matrix.length; i++) {

	    int sum = calculateRowSum(matrix, i);
	    if (sum != magicSum) {
		return false;
	    }

	}
	return true;
    }

    public static boolean checkColumns(int matrix[][]) {

	for (int i = 0; i < matrix.length; i++) {

	    int sum = calculateColumnSum(matrix, i);
	    if (sum != magicSum) {
		return false;
	    }

	}
	return true;
    }

    public static boolean[] createBooleanArray() {
	boolean a[] = new boolean[n];

	for (int i = 0; i < a.length; i++) {
	    a[i] = true;
	}

	return a;
    }

    public static int calculateRowSum(int matrix[][], int row) {
	int rowSum = 0;

	for (int i = 0; i < matrix[row].length; i++) {
	    rowSum = rowSum + matrix[row][i];
	}

	return rowSum;
    }

    public static int calculateColumnSum(int matrix[][], int column) {
	int columnSum = 0;

	for (int j = 0; j < matrix.length; j++) {
	    columnSum = columnSum + matrix[j][column];
	}

	return columnSum;
    }

    public static int calculateDiagonalSum(int matrix[][]) {
	int diagonalSum = 0;

	for (int i = 0; i < matrix.length; i++) {
	    diagonalSum = diagonalSum + matrix[i][i];
	}

	return diagonalSum;
    }

    public static int calculateBackDiagonalSum(int matrix[][]) {
	int backDiagonalSum = 0;

	for (int i = 0; i < matrix.length; i++) {
	    backDiagonalSum = backDiagonalSum + matrix[i][matrix.length - i - 1];
	}

	return backDiagonalSum;
    }
}
