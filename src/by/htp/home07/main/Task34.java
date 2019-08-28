package by.htp.home07.main;

import java.util.Random;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца. 
 * */

public class Task34 {

    public static void main(String[] args) {
	int m = 7;
	int n = 7;
	int matrix[][] = new int[m][n];

	Random random = new Random();

	for (int i = 0; i < matrix[0].length; i++) {

	    int count1 = 0;
	    for (int j = 0; j < matrix.length; j++) {

		if (count1 >= i) {
		    matrix[j][i] = 0;
		} else if (i - count1 < m - count1 - j) {
		    matrix[j][i] = random.nextInt(2);
		} else {
		    matrix[j][i] = 1;
		}

		if (matrix[j][i] == 1) {
		    count1++;
		}
	    }
	}

	Utils.printMatrix(matrix);
    }
}
