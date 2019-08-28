package by.htp.home07.main;

/*5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 
 * 
 * В java элементы массивов считаются с 0, а люди считают с 1. 
 * Поэтому будем выводить строки, которые для java считаются нечётными
 * */

public class Task05 {

    public static void main(String[] args) {
	int matrix[][] = Utils.createMatrix(5, 5, 10);
	Utils.printMatrix(matrix);

	for (int i = 0; i < matrix.length; i++) {

	    if ((i + 1) % 2 == 0) {
		System.out.println();
		for (int j = 0; j < matrix[i].length; j++) {
		    System.out.print(matrix[i][j] + " ");
		}
	    }
	}
    }
}
