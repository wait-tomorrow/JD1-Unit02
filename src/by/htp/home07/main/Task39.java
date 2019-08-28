package by.htp.home07.main;

/*39. Найдите произведение двух матриц.*/

public class Task39 {

    public static void main(String[] args) {
	int n = 3;
	int matrix1[][] = Utils.createMatrix(n, n, 10);
	System.out.println("Первая матрица: ");
	Utils.printMatrix(matrix1);

	int matrix2[][] = Utils.createMatrix(n, n, 10);
	System.out.println("Вторая матрица: ");
	Utils.printMatrix(matrix2);

	int matrixResult[][] = new int[n][n];
	for (int i = 0; i < matrix1.length; i++) {
	    for (int j = 0; j < matrix1[i].length; j++) {
		for (int k = 0; k < matrix1[i].length; k++) {
		    matrixResult[i][j] = matrixResult[i][j] + (matrix1[i][k] * matrix2[k][j]);
		}
	    }
	}

	System.out.println("\nПроизведение матриц:");
	Utils.printMatrix(matrixResult);
    }
}
