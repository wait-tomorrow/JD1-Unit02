package by.htp.home07.main;

/*3. Дана матрица. Вывести на экран первый и последний столбцы*/

public class Task03 {

    public static void main(String[] args) {
	int n = 5;
	int m = 4;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	System.out.println("\nПервый столбец:");
	for (int i = 0; i < n; i++) {
	    System.out.print(matrix[i][0] + " ");
	}

	System.out.println("\nПоследний столбец:");
	for (int i = 0; i < n; i++) {
	    System.out.print(matrix[i][m - 1] + " ");
	}
    }
}
