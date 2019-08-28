package by.htp.home07.main;

/*
 * 36. Операция сглаживания матрицы дает новую матрицу того же размера, 
 * каждый элемент которой получается как среднее арифметическое соседей 
 * соответствующего элемента исходной матрицы. 
 * Построить результат сглаживания заданной матрицы 
 * */

public class Task36 {

    public static void main(String[] args) {
	int n = 4;
	int matrix[][] = Utils.createMatrix(n, n, 100);
	Utils.printMatrix(matrix);

	int smoothedMatrix[][] = new int[n][n];
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		smoothedMatrix[i][j] = smoothingElemMatrix(matrix, i, j);
	    }
	}

	System.out.println("\nСглаженная матрица: ");
	Utils.printMatrix(smoothedMatrix);
    }

    public static int smoothingElemMatrix(int matrix[][], int i, int j) {
	int countNeighbours = 0;
	int sumNeighbours = 0;

	if (i > 0) {
	    countNeighbours++;
	    sumNeighbours = sumNeighbours + matrix[i - 1][j];
	}

	if (i < matrix.length - 1) {
	    countNeighbours++;
	    sumNeighbours = sumNeighbours + matrix[i + 1][j];
	}

	if (j > 0) {
	    countNeighbours++;
	    sumNeighbours = sumNeighbours + matrix[i][j - 1];
	}

	if (j < matrix[i].length - 1) {
	    countNeighbours++;
	    sumNeighbours = sumNeighbours + matrix[i][j + 1];
	}

	return sumNeighbours / countNeighbours;
    }
}
