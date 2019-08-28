package by.htp.home07.main;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней. 
 * */

public class Task31 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(6, 5, 999);
	Utils.printMatrix(matrix);

	int countTwoDigit = 0;
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] >= 10 && matrix[i][j] <= 99) {
		    countTwoDigit++;
		}
	    }
	}

	System.out.println("Количество двузначных чисел в матрице: " + countTwoDigit);
    }
}
