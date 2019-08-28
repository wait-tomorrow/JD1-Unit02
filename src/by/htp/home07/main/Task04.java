package by.htp.home07.main;

/*4. Дана матрица. Вывести на экран первую и последнюю строки.*/

public class Task04 {

    public static void main(String[] args) {
	int n = 4;
	int m = 5;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	System.out.println("\nПервая строка:");
	for (int i = 0; i < m; i++) {
	    System.out.print(matrix[0][i] + " ");
	}

	System.out.println("\nПоследняя строка:");
	for (int i = 0; i < m; i++) {
	    System.out.print(matrix[n - 1][i] + " ");
	}
    }
}