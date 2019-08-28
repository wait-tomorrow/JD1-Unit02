package by.htp.home07.main;

/*38. Найдите сумму двух матриц*/

public class Task38 {

    public static void main(String[] args) {
	int n = 2;
	int matrix1[][] = Utils.createMatrix(n, n, 10);
	System.out.println("Первая матрица:");
	Utils.printMatrix(matrix1);

	int matrix2[][] = Utils.createMatrix(n, n, 10);
	System.out.println("Вторая матрица:");
	Utils.printMatrix(matrix2);

	int matrixResult[][] = new int[n][n];
	for (int i = 0; i < matrix1.length; i++) {
	    for (int j = 0; j < matrix1[i].length; j++) {
		matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
	    }
	}

	System.out.println("\nРезультат сложения:");
	Utils.printMatrix(matrixResult);
    }
}
