package by.htp.home07.main;

/*
 * 8. Дан двухмерный массив n×m элементов. 
 * Определить, сколько раз встречается число 7 среди элементов массива. 
 * */

public class Task08 {

    public static void main(String[] args) {
	int n = 4;
	int m = 5;
	int matrix[][] = Utils.createMatrix(n, m, 10);
	Utils.printMatrix(matrix);

	int count = 0;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {

		if (matrix[i][j] == 7) {
		    count++;
		}
	    }
	}

	System.out.println("\nКоличество цифр 7: " + count);
    }
}
