package by.htp.home07.main;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на соответствующие им позиции 
 * другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры. 
 * */

public class Task27 {

    public static void main(String[] args) {
	int n = 5;
	int matrix[][] = Utils.createMatrix(n, n, 10);
	Utils.printMatrix(matrix);

	Scanner sc = new Scanner(new InputStreamReader(System.in));
	System.out.print(">");
	int column1 = sc.nextInt();
	System.out.print(">");
	int column2 = sc.nextInt();

	for (int i = 0; i < n; i++) {
	    int temp = matrix[i][column1];
	    matrix[i][column1] = matrix[i][column2];
	    matrix[i][column2] = temp;
	}

	System.out.println("\n------");
	Utils.printMatrix(matrix);

	sc.close();
    }
}
