package by.htp.home07.main;

/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 
 * */

public class Task30 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(10, 20, 15);
	Utils.printMatrix(matrix);

	for (int i = 0; i < matrix.length; i++) {

	    int count5 = 0;
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] == 5) {
		    count5++;
		}
	    }

	    if (count5 >= 3) {
		System.out.println("В строке " + (i + 1) + " число \"5\" встречается более 3 раз");
	    }
	}
    }
}
